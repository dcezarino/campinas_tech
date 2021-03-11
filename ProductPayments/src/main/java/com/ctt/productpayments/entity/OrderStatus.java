package com.ctt.productpayments.entity;

import lombok.Data;

@Data
public class OrderStatus {

	private Long id;

	private String name;

	private String code;

	private PaymentStatus paymentStatus;

}
