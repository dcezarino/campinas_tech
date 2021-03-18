package com.ctt.productpayments.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.ctt.productpayments.request.ClientRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(of = { "id", "email" })

@NoArgsConstructor
@Entity
public class Client {

	public Client(ClientRequest clientRequest) {
		this.fillClientFromDto(clientRequest);
		this.setOrders(orders);
	}

	public void fillClientFromDto(ClientRequest clientRequest) {
		this.setEmail(clientRequest.getEmail());
		this.setAddress(clientRequest.getAddress());
		this.setOrders(clientRequest.getOrders());
	}

	public Client(String email, String address) {
		this.setEmail(email); 
		this.setAddress(address);
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, unique = true)
	private String email;

	@Column(nullable = false)
	private String address;

	@JsonIgnore
    @OneToMany(mappedBy = "client")
	private List<Order> orders = new ArrayList<>();

}

