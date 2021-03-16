package com.ctt.productpayments.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctt.productpayments.entity.Client;
import com.ctt.productpayments.repository.ClientRepository;
import com.ctt.productpayments.request.ClientRequest;
import com.ctt.productpayments.response.ClientResponse;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;

	public Client findById(Long id) {
		Optional<Client> clientOptional = this.clientRepository.findById(id);
		Client client = clientOptional.orElseThrow();
		return client;
	}
	
	public List<ClientResponse> getAll() {
		return this.clientRepository.findAll()
				.stream()
				.map(ClientResponse::new)
				.collect(Collectors.toList());	
	}

	public ClientResponse create(ClientRequest clientRequest) {
		Client client = new Client(clientRequest);
		Client clientCreated = this.clientRepository.save(client);
		return new ClientResponse(clientCreated);
	}


	public ClientResponse update(ClientRequest clientRequest, Long id) {

		Client client = this.findById(id);
		client.fillClientFromDto(clientRequest);

		this.clientRepository.save(client);
		return new ClientResponse(client);
	}

}
