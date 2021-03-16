package com.ctt.productpayments.response;

import com.ctt.productpayments.entity.OrderStatus;
import com.ctt.productpayments.entity.PaymentStatus;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrderStatusResponse {
	
	public OrderStatusResponse(OrderStatus orderStatus) {	
		this.setId(orderStatus.getId());
		this.setName(orderStatus.getName());
		this.setCode(orderStatus.getCode() + String.format("%02d", orderStatus.getId()));
		this.setPaymentStatus(orderStatus.getPaymentStatus());
	}
	
	private Long id;
	
	private String name;
	
	private String code;
		
	private PaymentStatus paymentStatus;


}
