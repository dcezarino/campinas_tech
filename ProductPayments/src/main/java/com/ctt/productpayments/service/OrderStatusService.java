package com.ctt.productpayments.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctt.productpayments.entity.OrderStatus;
import com.ctt.productpayments.exception.NotFound;
import com.ctt.productpayments.repository.OrderStatusRepository;
import com.ctt.productpayments.request.OrderStatusRequest;
import com.ctt.productpayments.response.OrderStatusResponse;

@Service
public class OrderStatusService {
	
	@Autowired
	private OrderStatusRepository orderStatusRepository;
	
	private OrderStatus findById(Long id) {
		OrderStatus orderStatus = this.orderStatusRepository.findById(id).orElseThrow(() -> new NotFound());
		return orderStatus;
	}	

	public OrderStatusResponse create(OrderStatusRequest orderStatusRequest) {
		OrderStatus orderStatus = new OrderStatus(orderStatusRequest);
		OrderStatus orderStatusCreated = this.orderStatusRepository.save(orderStatus);
		return new OrderStatusResponse(orderStatusCreated);
	}
	
	public OrderStatusResponse update(OrderStatusRequest orderStatusRequest, Long id) {

		OrderStatus orderStatus = this.findById(id);
		orderStatus.fillOrderStatusFromDto(orderStatusRequest);

		this.orderStatusRepository.save(orderStatus);
		return new OrderStatusResponse(orderStatus);
	}

	

}
