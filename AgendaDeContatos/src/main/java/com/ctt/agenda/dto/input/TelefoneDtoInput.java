package com.ctt.agenda.dto.input;

import javax.validation.constraints.Size;

import lombok.Data;

// Não é indicado fazer herança entre Dtos
@Data
public class TelefoneDtoInput {	
	
	private String tipo;

	@Size(min = 2, max = 2, message = "DDD deve conter 2 dígitos")	
	private String ddd;

	@Size(min = 8, max = 9, message = "Telefone deve conter no mínimo 8 e no máximo 9 dígitos")
	private String numero;	

}