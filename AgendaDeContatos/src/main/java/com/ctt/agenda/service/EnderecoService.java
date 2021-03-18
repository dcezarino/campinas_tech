package com.ctt.agenda.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctt.agenda.dto.input.EnderecoDtoInput;
import com.ctt.agenda.dto.output.EnderecoDtoOutput;
import com.ctt.agenda.entity.Endereco;
import com.ctt.agenda.exception.NotFound;
import com.ctt.agenda.repository.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;


	private Endereco findById(Long id) {
		Endereco endereco = this.enderecoRepository.findById(id).orElseThrow(() -> new NotFound());
		return endereco;
	}

	public EnderecoDtoOutput create(EnderecoDtoInput enderecoDtoInput) {
		Endereco endereco = new Endereco(enderecoDtoInput);
		this.enderecoRepository.save(endereco);
		return new EnderecoDtoOutput(endereco);
	}

	public EnderecoDtoOutput update(EnderecoDtoInput enderecoDtoInput, Long id) {
		// Optional<Endereco> enderecoOptional = this.enderecoRepository.findById(id);

		// Endereco endereco = enderecoOptional.get();
		Endereco endereco = this.findById(id);
		endereco.fillEnderecoFromDto(enderecoDtoInput);

		this.enderecoRepository.save(endereco);
		return new EnderecoDtoOutput(endereco);
	}

	public List<EnderecoDtoOutput> getAll() {
		return this.enderecoRepository.findAll().stream().map(EnderecoDtoOutput::new).collect(Collectors.toList());
	}

	public EnderecoDtoOutput get(Long id) {
//		Optional<Endereco> enderecoOptional = this.enderecoRepository.findById(id);
//		Endereco endereco = enderecoOptional.orElseThrow(() -> new NotFound());
		Endereco endereco = this.findById(id);
		return new EnderecoDtoOutput(endereco);
	}

	public void delete(Long id) {
		// Endereco endereco = this.enderecoRepository.findById(id).orElseThrow(() ->
		// new NotFound());
		Endereco endereco = this.findById(id);
		this.enderecoRepository.delete(endereco);
	}

}
