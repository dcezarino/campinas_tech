package com.ctt.productpayments.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ctt.productpayments.request.OrderRequest;
import com.ctt.productpayments.response.OrderResponse;
import com.ctt.productpayments.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@GetMapping(consumes = "application/json", produces = "application/json")
	public List<OrderResponse> get() {
		return this.orderService.getOrderStatus();
	}

	@PostMapping(consumes = "application/json", produces = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public OrderResponse post(@Valid @RequestBody OrderRequest orderRequest) {
		return this.orderService.create(orderRequest);
	}

}
