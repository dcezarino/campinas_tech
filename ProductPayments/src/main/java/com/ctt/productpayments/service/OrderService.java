package com.ctt.productpayments.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctt.productpayments.entity.Client;
import com.ctt.productpayments.entity.Order;
import com.ctt.productpayments.entity.OrderStatus;
import com.ctt.productpayments.entity.Payment;
import com.ctt.productpayments.entity.PaymentStatus;
import com.ctt.productpayments.entity.PaymentType;
import com.ctt.productpayments.entity.Product;
import com.ctt.productpayments.exception.NotFound;
import com.ctt.productpayments.repository.ClientRepository;
import com.ctt.productpayments.repository.OrderRepository;
import com.ctt.productpayments.repository.OrderStatusRepository;
import com.ctt.productpayments.repository.PaymentRepository;
import com.ctt.productpayments.repository.ProductRepository;
import com.ctt.productpayments.request.OrderRequest;
import com.ctt.productpayments.response.OrderResponse;

@Service
public class OrderService {

	@Autowired
	private OrderStatusRepository orderStatusRepository;

	@Autowired
	private ClientRepository clientRepository;

	@Autowired
	private PaymentRepository paymentRepository;

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private OrderRepository orderRepository;

	public List<OrderResponse> getOrderStatus() {

		List<Order> ordersNewStatus = orderRepository.findOrdersWaiting();

		List<OrderResponse> ordersUpdate = new ArrayList<OrderResponse>();

		for (Order ordersWithNewStatus : ordersNewStatus) {
			Random random = new Random();
			int number = random.nextInt(2);

			if (number == 1) {
				Optional<OrderStatus> orderStatus = orderStatusRepository.findById(2L);
				ordersWithNewStatus.setOrderStatus(orderStatus.get());
				orderRepository.save(ordersWithNewStatus);
				ordersUpdate.add(new OrderResponse(ordersWithNewStatus));
			} else if (number == 2) {
				Optional<OrderStatus> orderStatus = orderStatusRepository.findById(1L);
				ordersWithNewStatus.setOrderStatus(orderStatus.get());
				orderRepository.save(ordersWithNewStatus);
				ordersUpdate.add(new OrderResponse(ordersWithNewStatus));
			} else {
				Optional<OrderStatus> orderStatus = orderStatusRepository.findById(3L);
				ordersWithNewStatus.setOrderStatus(orderStatus.get());
				orderRepository.save(ordersWithNewStatus);
				ordersUpdate.add(new OrderResponse(ordersWithNewStatus));
			}
		}
		return ordersUpdate;

	}

	public OrderResponse create(OrderRequest orderRequest) {
		Client client = clientRepository.findByEmail(orderRequest.getEmail()).orElseGet(() -> {
			Client clientCreated = new Client(orderRequest.getEmail(), orderRequest.getAddress());
			return clientRepository.save(clientCreated);
		});

		Payment payment = new Payment(orderRequest.getPayment());

		if (payment.getPaymentType().equals(PaymentType.DEBIT)) {
			Random random = new Random();
			int numero = random.nextInt(2) + 1;

			if (numero == 1) {
				payment.setPaymentStatus(PaymentStatus.APPROVED);
			} else {
				payment.setPaymentStatus(PaymentStatus.REPROVED);
			}

		} else {
			payment.setPaymentStatus(PaymentStatus.WAITING);
		}

		Payment paymentCreated = paymentRepository.save(payment);

		OrderStatus orderStatus = orderStatusRepository.findByPaymentStatus(paymentCreated.getPaymentStatus())
				.orElseThrow(() -> new NotFound());

		List<Product> products = productRepository.findProductByIdIn(orderRequest.getProductsIds());

		Order order = new Order(orderRequest, client, paymentCreated, products, orderStatus);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-YYYY HH:mm");
		LocalDateTime dateTime = order.getDate();
		String formattedDateTime = dateTime.format(formatter);
		String finalDate = formattedDateTime.replaceAll("[^0-9]+", "");		

		Order orderCreated = this.orderRepository.save(order);

		Long id = orderCreated.getId();
		String idString = Long.toString(id);
				
		orderCreated.setCode(finalDate + idString);

		orderRepository.saveAndFlush(orderCreated);

		return new OrderResponse(orderCreated);

	}

	public List<OrderResponse> getInformationOrders(Long idClient) {
		Client client = this.clientRepository.findById(idClient).orElseThrow(() -> new NotFound());
		List<OrderResponse> orders = client.getOrders().stream().sorted(Comparator.comparing(Order::getDate))
				.map(OrderResponse::new).collect(Collectors.toList());

		return orders;
	}

}
