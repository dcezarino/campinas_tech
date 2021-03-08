package com.ctt.vacina.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.ctt.vacina.dto.request.UsuarioRequest;
import com.ctt.vacina.dto.response.UsuarioResponse;
import com.ctt.vacina.entity.Usuario;
import com.ctt.vacina.exception.CPFJaExistenteException;
import com.ctt.vacina.exception.EmailJaExistenteException;
import com.ctt.vacina.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

//	public Usuario create(Usuario usuario) {		
//		return this.usuarioRepository.save(usuario);		
//	}

	public UsuarioResponse create(UsuarioRequest usuarioRequest) {
		Usuario usuario = new Usuario(usuarioRequest);
		try {
			Usuario usuarioCriado = this.usuarioRepository.save(usuario);
			return new UsuarioResponse(usuarioCriado);
		} catch (DataIntegrityViolationException e) {

			if (this.usuarioRepository.findByEmail(usuarioRequest.getEmail()).isPresent()) {
				throw new EmailJaExistenteException();
			} else if (this.usuarioRepository.findByCpf(usuarioRequest.getCpf()).isPresent()) {
				throw new CPFJaExistenteException();
			} else {
				throw e;
			}

		}
	}

}
