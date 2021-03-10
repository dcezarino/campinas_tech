package com.ctt.agenda.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Endereço inválido.")
public class InvalidEndereco extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
