package com.ctt.productpayments.response;

import java.time.LocalDateTime;
import java.util.List;

import com.ctt.productpayments.entity.Client;
import com.ctt.productpayments.entity.Order;
import com.ctt.productpayments.entity.OrderStatus;
import com.ctt.productpayments.entity.Product;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrderResponse {

	public OrderResponse(Order order) {
		this.setClient(order.getClient());
		this.setProductsIds(order.getProducts());
		this.setCodeOrder(order.getCode());
		this.setOrderStatus(order.getOrderStatus());
		this.setOrder(order);
		this.setDate(order.getDate());
	}

	@JsonIgnore
	private Client client;

	private List<Product> productsIds;

	private String codeOrder;

	@JsonIgnore
	private Order order;
		
	private OrderStatus orderStatus;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime date;

}
