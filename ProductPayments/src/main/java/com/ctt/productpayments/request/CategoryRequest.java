package com.ctt.productpayments.request;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.ctt.productpayments.entity.Product;

import lombok.Data;

@Data
public class CategoryRequest {

	@NotBlank
	private String name;
	
	@NotBlank
	@Size(max = 3, message = "code cannot be greater than three")
	private String code;
		
    private List<Product> products;

}
