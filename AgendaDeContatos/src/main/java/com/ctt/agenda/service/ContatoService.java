package com.ctt.agenda.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctt.agenda.dto.input.ContatoDtoInput;
import com.ctt.agenda.dto.output.ContatoDtoOutput;
import com.ctt.agenda.entity.Contato;
import com.ctt.agenda.entity.Endereco;
import com.ctt.agenda.entity.Telefone;
import com.ctt.agenda.exception.InvalidEndereco;
import com.ctt.agenda.exception.InvalidTelefone;
import com.ctt.agenda.exception.NotFound;
import com.ctt.agenda.repository.ContatoRepository;
import com.ctt.agenda.repository.EnderecoRepository;
import com.ctt.agenda.repository.TelefoneRepository;

@Service
public class ContatoService {

//	@Autowired
//	private ContatoConverter contatoConverter;

	@Autowired
	private ContatoRepository contatoRepository;

	@Autowired
	private TelefoneRepository telefoneRepository;

	@Autowired
	private EnderecoRepository enderecoRepository;

	private Contato findById(Long id) {
		Optional<Contato> contatoOptional = this.contatoRepository.findById(id);
		Contato contato = contatoOptional.orElseThrow(() -> new NotFound());
		return contato;	}

	public ContatoDtoOutput create(ContatoDtoInput contatoDtoInput) {
		Telefone telefone = telefoneRepository.findById(contatoDtoInput.getIdTelefone()).orElseThrow(() -> new InvalidTelefone());
		Endereco endereco = enderecoRepository.findById(contatoDtoInput.getIdEndereco()).orElseThrow(() -> new InvalidEndereco());

		Contato contato = new Contato(contatoDtoInput, endereco, telefone);
		this.contatoRepository.save(contato);		
		return new ContatoDtoOutput(contato);
	}

	public ContatoDtoOutput update(ContatoDtoInput contatoDtoInput, Long id) {
		// Contato contato = this.contatoRepository.findById(id).get();
		Contato contato = this.findById(id);
		contato.fillContatoFromDto(contatoDtoInput);
		this.contatoRepository.save(contato);
		return new ContatoDtoOutput(contato);
	}

	public List<ContatoDtoOutput> getAll() {
		return this.contatoRepository.findAll().stream().map(ContatoDtoOutput::new).collect(Collectors.toList());
	}

	public ContatoDtoOutput get(Long id) {
		Contato contato = this.findById(id);
		return new ContatoDtoOutput(contato);
	}

	public void delete(Long id) {
		// Contato contato = this.contatoRepository.findById(id).orElseThrow(() -> new
		// NotFound());
		Contato contato = this.findById(id);
		this.contatoRepository.delete(contato);
	}

}