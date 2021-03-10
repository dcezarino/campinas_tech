package com.ctt.agenda.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctt.agenda.dto.input.TelefoneDtoInput;
import com.ctt.agenda.dto.output.TelefoneDtoOutput;
import com.ctt.agenda.entity.Telefone;
import com.ctt.agenda.exception.NotFound;
import com.ctt.agenda.repository.TelefoneRepository;

@Service
public class TelefoneService {

	@Autowired
	private TelefoneRepository telefoneRepository;

//	@Autowired
//	private TelefoneConverter telefoneConverter;

	private Telefone findById(Long id) {
		return this.telefoneRepository.findById(id).orElseThrow(() -> new NotFound());
	}

	public TelefoneDtoOutput create(TelefoneDtoInput telefoneDtoInput) {
		Telefone telefone = new Telefone(telefoneDtoInput);
		this.telefoneRepository.save(telefone);
		return new TelefoneDtoOutput(telefone);
	}

	public TelefoneDtoOutput update(TelefoneDtoInput telefoneDtoInput, Long id) {
//		Optional<Telefone> telefoneOptional = this.telefoneRepository.findById(id);
//		Telefone telefone = telefoneOptional.get();
		Telefone telefone = this.findById(id);

		telefone.fillTelefoneFromDto(telefoneDtoInput);

		this.telefoneRepository.save(telefone);
		return new TelefoneDtoOutput(telefone);
	}

	public List<TelefoneDtoOutput> getAll() {
		return this.telefoneRepository.findAll().stream().map(TelefoneDtoOutput::new).collect(Collectors.toList());
	}

	public TelefoneDtoOutput get(Long id) {
		Telefone telefone = this.findById(id);
		return new TelefoneDtoOutput(telefone);
	}

	public void delete(Long id) {
		// Telefone telefone = this.telefoneRepository.findById(id).orElseThrow(() ->
		// new NotFound());
		Telefone telefone = this.findById(id);
		this.telefoneRepository.delete(telefone);
	}

}