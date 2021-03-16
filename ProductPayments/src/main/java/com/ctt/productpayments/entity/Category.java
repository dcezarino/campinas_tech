package com.ctt.productpayments.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import com.ctt.productpayments.request.CategoryRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(of = { "id" })
@NoArgsConstructor
@Entity
public class Category {
	
	public Category(CategoryRequest categoryRequest) {
		this.fillCategoryFromDto(categoryRequest);
	}

	public void fillCategoryFromDto(CategoryRequest categoryRequest) {
		this.setName(categoryRequest.getName());
		this.setCode(categoryRequest.getCode());
		//this.setProducts(categoryRequest.getProducts());		
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	@Size(max = 5)
	private String code;
	
	@JsonIgnore
	@OneToMany(mappedBy = "category")
	private List<Product> products = new ArrayList<>();
	

}
