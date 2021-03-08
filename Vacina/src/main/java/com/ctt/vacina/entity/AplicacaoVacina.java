package com.ctt.vacina.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ctt.vacina.dto.request.AplicacaoVacinaRequest;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class AplicacaoVacina {
	
	public AplicacaoVacina(AplicacaoVacinaRequest aplicacaoVacinaRequest, Usuario usuario) {
		this.fillFromDTO(aplicacaoVacinaRequest, usuario);
		this.setUsuario(usuario);	
	}
	
	public void fillFromDTO(AplicacaoVacinaRequest aplicacaoVacinaRequest, Usuario usuario) {
		this.setDataDaVacina(aplicacaoVacinaRequest.getDataDaVacina());
		this.setNomeDaVacina(aplicacaoVacinaRequest.getNomeDaVacina());		
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 20)
	private String nomeDaVacina;

	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date dataDaVacina;

	// fetch: só irá carregar a Aplicação da Vacina quando necessário
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

}
