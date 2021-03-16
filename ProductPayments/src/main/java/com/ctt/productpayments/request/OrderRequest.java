package com.ctt.productpayments.request;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class OrderRequest {
	
	private List<Long> productsIds;
	
	@NotBlank
	private String email;
	
	@NotBlank
	private String address;
	
	@NotNull
	private PaymentRequest payment;
	
	@NotBlank
	private String deliveredAddres;		

}
