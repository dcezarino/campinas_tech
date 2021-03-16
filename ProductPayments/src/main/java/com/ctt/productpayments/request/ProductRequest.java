package com.ctt.productpayments.request;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ProductRequest {	
	
	@NotBlank
	@Size(min = 2, max = 255)
	private String name;
		
	@NotNull	
	@Positive
    private Long idCategory;
	
	@NotNull
	@Positive
	private Double price;
	
	@NotNull	
	private List<String> details;

}
