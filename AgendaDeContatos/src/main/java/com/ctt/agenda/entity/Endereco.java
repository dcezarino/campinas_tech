package com.ctt.agenda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ctt.agenda.dto.input.EnderecoDtoInput;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(of = { "id" })
@NoArgsConstructor
@Entity
public class Endereco {
	
	public Endereco(EnderecoDtoInput enderecoDtoInput) {
		fillEnderecoFromDto(enderecoDtoInput);		
	}

	public void fillEnderecoFromDto(EnderecoDtoInput enderecoDtoInput) {
		this.setCep(enderecoDtoInput.getCep());
		this.setRua(enderecoDtoInput.getRua());
		this.setNumero(enderecoDtoInput.getNumero());
		this.setCidade(enderecoDtoInput.getCidade());
		this.setEstado(enderecoDtoInput.getEstado());
		this.setComplemento(enderecoDtoInput.getComplemento());			
	}

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String rua;
			
	private String numero;
			
	private String complemento;
	
	@Column(nullable = false)
	private String cidade;
	
	@Column(nullable = false)
	private String estado;
	
	@Column(nullable = false, length = 10)
	private String cep;

	
}
