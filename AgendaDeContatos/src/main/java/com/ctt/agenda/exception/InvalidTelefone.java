package com.ctt.agenda.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Telefone inválido.")
public class InvalidTelefone extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
