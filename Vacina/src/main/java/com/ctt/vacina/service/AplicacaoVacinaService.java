package com.ctt.vacina.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctt.vacina.dto.request.AplicacaoVacinaRequest;
import com.ctt.vacina.dto.response.AplicacaoVacinaResponse;
import com.ctt.vacina.entity.AplicacaoVacina;
import com.ctt.vacina.entity.Usuario;
import com.ctt.vacina.exception.UsuarioInexistenteException;
import com.ctt.vacina.repository.AplicacaoVacinaRepository;
import com.ctt.vacina.repository.UsuarioRepository;

@Service
public class AplicacaoVacinaService {

	@Autowired
	private AplicacaoVacinaRepository aplicacaoVacinaRepository;

	@Autowired
	private UsuarioRepository usuarioRepository;

//	public AplicacaoVacina create(AplicacaoVacina aplicacaoVacina) {
//		return this.aplicacaoVacinaRepository.save(aplicacaoVacina);		
//	}

	public AplicacaoVacinaResponse create(AplicacaoVacinaRequest aplicacaoVacinaRequest) {
		Usuario usuario = this.usuarioRepository.findById(aplicacaoVacinaRequest.getIdUsuario())
				.orElseThrow(() -> new UsuarioInexistenteException());
		
		AplicacaoVacina aplicacaoVacina = new AplicacaoVacina(aplicacaoVacinaRequest, usuario);

		AplicacaoVacina aplicacaoVacinaSalva = this.aplicacaoVacinaRepository.save(aplicacaoVacina);

		return new AplicacaoVacinaResponse(aplicacaoVacinaSalva);

	}

}
