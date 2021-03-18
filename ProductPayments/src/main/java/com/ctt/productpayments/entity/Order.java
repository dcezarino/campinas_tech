package com.ctt.productpayments.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.ctt.productpayments.request.OrderRequest;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data@EqualsAndHashCode(of = { "id" })
@NoArgsConstructor
@Entity
@Table(name="Orders")
public class Order {	
	
	public Order(OrderRequest orderRequest, Client client, Payment payment, List<Product> products, OrderStatus orderStatus) {
		this.setDeliveredAddress(orderRequest.getDeliveredAddres());	
		this.setClient(client);
		this.setPayment(payment);
		this.setProducts(products);				
		this.setOrderStatus(orderStatus);		
		this.setDate(LocalDateTime.now());
	}	

	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
		
	@ManyToMany	
	@JoinTable (name = "order_products",
	joinColumns = @JoinColumn(name = "order_id"),
	inverseJoinColumns = @JoinColumn(name = "product_id"))
	@JsonIgnore
    private List<Product> products = new ArrayList<>();	
	
	@ManyToOne(fetch = FetchType.EAGER)	
	@JoinColumn(name = "id_client", referencedColumnName = "id")	
	private Client client;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_orderStatus", referencedColumnName = "id")
	private OrderStatus orderStatus;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_payment", referencedColumnName = "id")
	private Payment payment;
	
	@Column(name = "local_date_time", columnDefinition = "TIMESTAMP")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime date;
	
	@Column(name = "code")
	private String code;	
	
	private String deliveredAddress;

}
