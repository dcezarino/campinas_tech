package com.ctt.productpayments.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.persistence.Column;

import lombok.Data;

@Data
public class Order {
	
	private Long id;
	
	private ArrayList<String> products;
	
	private Client cliente;
	
	private OrderStatus orderStatus;
	
	private Payment payment;
	
	private String deliveredAddress;
	
	@Column(name = "local_date_time", columnDefinition = "TIMESTAMP")
	private LocalDateTime localDateTime;
	
	private String code;	
	

}
