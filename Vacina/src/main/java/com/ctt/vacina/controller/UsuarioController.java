package com.ctt.vacina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ctt.vacina.dto.request.UsuarioRequest;
import com.ctt.vacina.dto.response.UsuarioResponse;
import com.ctt.vacina.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;

//	@PostMapping(consumes = "application/json", produces = "application/json")
//	@ResponseStatus(HttpStatus.CREATED)
//	public Usuario post(@RequestBody Usuario usuario) {
//		return this.usuarioService.create(usuario);
//	}
	
	
	@PostMapping(consumes = "application/json", produces = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public UsuarioResponse post(@RequestBody UsuarioRequest usuarioRequest) {
		return this.usuarioService.create(usuarioRequest);
	}


}
