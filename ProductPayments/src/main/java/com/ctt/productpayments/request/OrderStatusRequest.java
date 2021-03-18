package com.ctt.productpayments.request;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.ctt.productpayments.entity.PaymentStatus;

import lombok.Data;

@Data
public class OrderStatusRequest {

	@NotBlank
	private String name;

	@NotBlank
	@Size(max = 5, message= "code cannot be greater than five")
	private String code;

	@NotNull
	@Enumerated(EnumType.STRING)
	private PaymentStatus paymentStatus;

}
