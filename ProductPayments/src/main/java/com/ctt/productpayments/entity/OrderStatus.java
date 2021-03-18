package com.ctt.productpayments.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ctt.productpayments.request.OrderStatusRequest;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(of = { "id" })
@NoArgsConstructor
@Entity
public class OrderStatus {

	public OrderStatus(OrderStatusRequest orderStatusRequest) {
		this.fillOrderStatusFromDto(orderStatusRequest);
	}

	public void fillOrderStatusFromDto(OrderStatusRequest orderStatusRequest) {
		this.setName(orderStatusRequest.getName());
		this.setCode(orderStatusRequest.getCode());
		this.setPaymentStatus(orderStatusRequest.getPaymentStatus());
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false, length = 5)
	private String code;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private PaymentStatus paymentStatus;

}
