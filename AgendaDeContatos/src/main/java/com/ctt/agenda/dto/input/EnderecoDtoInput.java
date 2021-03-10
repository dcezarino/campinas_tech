package com.ctt.agenda.dto.input;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class EnderecoDtoInput {
	
	@Size(max = 255, message = "Rua não pode ser maior que 255")
	@NotBlank
	private String rua;
	 
	@Size(max = 255, message = "Rua não pode ser maior que 255")
	private String numero;
	 
	@Size(max = 255, message = "Rua não pode ser maior que 255")
	private String complemento;
	 
	@Size(max = 255, message = "Rua não pode ser maior que 255")
	@NotBlank
	private String cidade;
	 
	@Size(max = 2, message = "Estado não pode ser maior que 2")
	@NotBlank
	private String estado;
	 
	@Size(max = 9, message = "CEP não pode ser maior que 9")
	@NotBlank
	private String cep;

}
