package com.ctt.productpayments.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ctt.productpayments.request.ClientRequest;
import com.ctt.productpayments.response.ClientResponse;
import com.ctt.productpayments.response.OrderResponse;
import com.ctt.productpayments.service.ClientService;
import com.ctt.productpayments.service.OrderService;

@RestController
@RequestMapping("/client")
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	@Autowired
	private OrderService orderService;
		
	@GetMapping("/findClientOrder/{idClient}")
	public List<OrderResponse> findByOrderID(@PathVariable Long idClient) {
		return this.orderService.getInformationOrders(idClient);
	}

	@GetMapping(produces = "application/json")
	public List<ClientResponse> get() {
		return this.clientService.getAll();
	}	
	
	@PostMapping(consumes = "application/json", produces = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public ClientResponse post(@Valid @RequestBody ClientRequest clientRequest) {
		return this.clientService.create(clientRequest);
	}

	@PutMapping(path = "/{id}", consumes = "application/json", produces = "application/json")
	public ClientResponse put(@Valid @RequestBody ClientRequest clientRequest, @PathVariable Long id) {
		return this.clientService.update(clientRequest, id);
	}

}
