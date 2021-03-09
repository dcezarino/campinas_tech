package com.ctt.agenda.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctt.agenda.converter.ContatoConverter;
import com.ctt.agenda.dto.input.ContatoDtoInput;
import com.ctt.agenda.dto.output.ContatoDtoOutput;
import com.ctt.agenda.entity.Contato;
import com.ctt.agenda.repository.ContatoRepository;

@Service
public class ContatoService {

	@Autowired
	private ContatoConverter contatoConverter;

	@Autowired
	private ContatoRepository contatoRepository;

	public ContatoDtoOutput create(ContatoDtoInput contatoDtoInput) {
		Contato contato = this.contatoConverter.dtoToModel(contatoDtoInput);
		this.contatoRepository.save(contato);
		return this.contatoConverter.modelToDto(contato);
	}
	
	public ContatoDtoOutput update(ContatoDtoInput contatoDtoInput, Long id) {
		Contato contato = this.contatoRepository.findById(id).get();
		contato.setNome(contatoDtoInput.getNome());
		this.contatoRepository.save(contato);
		return this.contatoConverter.modelToDto(contato);		
	}

	public List<ContatoDtoOutput> getAll() {
		return this.contatoConverter.modelToDto(this.contatoRepository.findAll());
	}

	public ContatoDtoOutput get(Long id) {
		Optional<Contato> contatoOptional = this.contatoRepository.findById(id);
		Contato contato = contatoOptional.get();
		return this.contatoConverter.modelToDto(contato);
	}

	public void delete(Long id) {
		this.contatoRepository.deleteById(id);
	}

}