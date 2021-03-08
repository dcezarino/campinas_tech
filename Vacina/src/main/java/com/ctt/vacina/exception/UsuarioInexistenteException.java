package com.ctt.vacina.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Usuário inexistente.")
public class UsuarioInexistenteException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
