package com.ctt.vacina.dto.response;

import java.util.Date;

import com.ctt.vacina.entity.AplicacaoVacina;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AplicacaoVacinaResponse {

	// Conversão para o DTO de response
	// Conversãoo dos dados da vacina
	// Conversãoo dados do usuario para usuarioResponse
	// Setou o usuario convertido para um Response	 	
	public AplicacaoVacinaResponse(AplicacaoVacina aplicacaoVacina) {
		this.setDataVacina(aplicacaoVacina.getDataDaVacina());
		this.setId(aplicacaoVacina.getId());
		this.setNomeVacina(aplicacaoVacina.getNomeDaVacina());

		UsuarioResponse usuarioResponse = new UsuarioResponse(aplicacaoVacina.getUsuario());
		this.setUsuario(usuarioResponse);
	}

	private Long id;

	private String nomeVacina;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date dataVacina;

	private UsuarioResponse usuario;

}
