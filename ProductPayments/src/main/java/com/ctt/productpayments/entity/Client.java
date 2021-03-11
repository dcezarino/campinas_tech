package com.ctt.productpayments.entity;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Client {
	
	private Long id;
	
	private String email;
	
	private String address;
	
	private ArrayList<String> orders;

}
