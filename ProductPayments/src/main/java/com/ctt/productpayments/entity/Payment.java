package com.ctt.productpayments.entity;

import lombok.Data;

@Data
public class Payment {

	private Long id;

	private PaymentType paymentType;

	private PaymentStatus paymentStatus;

	private String paymentProcessedAddress;

}
