package com.ctt.agenda.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctt.agenda.dto.input.TelefoneDtoInput;
import com.ctt.agenda.dto.output.TelefoneDtoOutput;

@RestController
@RequestMapping("/telefone")
public class TelefoneController {

	@GetMapping
	private String get() {
		return "Teste Get Telefone";
	}
	
	
	// Recebe o objeto de entrada (TelefoneDtoInput telefoneDtoInput), instância a classe TelefoneDtoOutput que extends TelefoneDtoInput e
	// em cada atributo da classe TelefoneDtoOutput eu gero um get para exibir os dados tipo, numero, ddd (Classe TelefoneDtoInput)
	@PostMapping(consumes = "application/json", produces = "application/json")
	public TelefoneDtoInput post(@RequestBody TelefoneDtoInput telefoneDtoInput) {
		System.out.println(telefoneDtoInput);
		TelefoneDtoOutput telefoneDtoOutput = new TelefoneDtoOutput();
		telefoneDtoOutput.setTipo(telefoneDtoInput.getTipo());
		telefoneDtoOutput.setNumero(telefoneDtoInput.getNumero());
		telefoneDtoOutput.setDdd(telefoneDtoInput.getDdd());
		telefoneDtoOutput.setId(1L);
		return telefoneDtoOutput;			
	}

}
