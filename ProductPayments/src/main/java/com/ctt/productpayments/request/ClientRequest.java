package com.ctt.productpayments.request;

import java.util.List;

import javax.validation.constraints.NotBlank;

import com.ctt.productpayments.entity.Order;

import lombok.Data;

@Data
public class ClientRequest {
		
	@NotBlank
	private String email;

	@NotBlank
	private String address;

	private List<Order> orders;

}
