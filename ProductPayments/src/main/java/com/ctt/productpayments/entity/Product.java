package com.ctt.productpayments.entity;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
    private Category category;
	
	@Column(nullable = false)
	private Double price;
	
	@Column(nullable = false)
	private ArrayList<String> details;	

	private String code;

}
