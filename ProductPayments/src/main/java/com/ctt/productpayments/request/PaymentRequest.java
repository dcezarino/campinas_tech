package com.ctt.productpayments.request;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.ctt.productpayments.entity.PaymentType;

import lombok.Data;

@Data
public class PaymentRequest {

	@NotNull
	@Enumerated(EnumType.STRING)
	private PaymentType paymentType;

	@NotBlank
	private String paymentProcessedAddress;

}
