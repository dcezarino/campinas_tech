package com.ctt.productpayments.response;

import java.util.List;

import com.ctt.productpayments.entity.Client;
import com.ctt.productpayments.entity.Order;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClientResponse {

	public ClientResponse(Client client) {
		this.setId(client.getId());
		this.setEmail(client.getEmail());
		this.setAddress(client.getAddress());
		this.setOrders(client.getOrders());
	}
	
	private Long id;
	
	private String email;
	
	private String address;
	
	private List<Order> orders;

}
