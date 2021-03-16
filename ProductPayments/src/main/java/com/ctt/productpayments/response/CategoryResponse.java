package com.ctt.productpayments.response;

import java.util.List;

import com.ctt.productpayments.entity.Category;
import com.ctt.productpayments.entity.Product;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CategoryResponse {

	public CategoryResponse(Category category) {			
		this.setName(category.getName());
		this.setCode(category.getCode() + String.format("%02d", category.getId()));			

		for (Product product : category.getProducts()) {
			products.add(new ProductResponse(product));
		}	

	}

	private String name;

	private String code;
	
	private List<ProductResponse> products;

}
