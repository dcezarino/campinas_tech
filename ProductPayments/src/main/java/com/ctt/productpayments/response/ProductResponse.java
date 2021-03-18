package com.ctt.productpayments.response;

import java.util.List;

import com.ctt.productpayments.entity.Category;
import com.ctt.productpayments.entity.Product;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductResponse {
	
	public ProductResponse(Product product) {
		this.setId(product.getId());
		this.setName(product.getName());
		this.setCategory(product.getCategory());
		this.setPrice(product.getPrice());
		this.setDetails(product.getDetails());			
	}	
	
	private Long id;
	
	private String name;
	
    private Category category;
	
	private Double price;
		
	private List<String> details;


}
