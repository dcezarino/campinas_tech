package com.ctt.productpayments.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ctt.productpayments.request.OrderStatusRequest;
import com.ctt.productpayments.response.OrderStatusResponse;
import com.ctt.productpayments.service.OrderStatusService;

@RestController
@RequestMapping("/orderStatus")
public class OrderStatusController {
		
		// Injeção de dependências
		@Autowired
		private OrderStatusService orderStatusService;		
		
		@PostMapping(consumes = "application/json", produces = "application/json")
		@ResponseStatus(HttpStatus.CREATED)
		public OrderStatusResponse post(@Valid @RequestBody OrderStatusRequest orderStatusRequest) {
			return this.orderStatusService.create(orderStatusRequest);
		}

		@PutMapping(path = "/{id}", consumes = "application/json", produces = "application/json")
		public OrderStatusResponse put(@Valid @RequestBody OrderStatusRequest orderStatusRequest, @PathVariable Long id) {
			return this.orderStatusService.update(orderStatusRequest, id);
		}

}
