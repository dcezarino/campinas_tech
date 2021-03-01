package com.ctt.olaMundo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("olaMundoVirtual")
public class OlaMundoController {
	
	@RequestMapping
	public String olaMundo() {
		return "Seja Bem Vindo";
	}
	

}
