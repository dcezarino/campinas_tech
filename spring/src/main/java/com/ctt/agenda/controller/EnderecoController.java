package com.ctt.agenda.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctt.agenda.dto.input.EnderecoDtoInput;
import com.ctt.agenda.dto.output.EnderecoDtoOutput;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

	@RequestMapping
	private String get() {
		return "Teste get Endereço";
	}

	@PostMapping(consumes = "application/json", produces = "application/json")
	public EnderecoDtoInput post(@RequestBody EnderecoDtoInput enderecoDtoInput) {
		System.out.println(enderecoDtoInput);
		EnderecoDtoOutput enderecoDtoOutput = new EnderecoDtoOutput();
		enderecoDtoOutput.setRua(enderecoDtoInput.getRua());
		enderecoDtoOutput.setNumero(enderecoDtoInput.getNumero());
		enderecoDtoOutput.setCidade(enderecoDtoInput.getCidade());
		enderecoDtoOutput.setEstado(enderecoDtoInput.getEstado());
		enderecoDtoOutput.setComplemento(enderecoDtoInput.getComplemento());
		enderecoDtoOutput.setCep(enderecoDtoInput.getCep());
		enderecoDtoOutput.setId(1L);
		return enderecoDtoOutput;
	}

}
