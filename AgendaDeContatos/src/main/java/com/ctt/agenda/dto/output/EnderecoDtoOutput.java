package com.ctt.agenda.dto.output;

import com.ctt.agenda.entity.Endereco;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class EnderecoDtoOutput{
	
	public EnderecoDtoOutput(Endereco endereco) {
		this.setCep(endereco.getCep());
		this.setRua(endereco.getRua());
		this.setNumero(endereco.getNumero());
		this.setCidade(endereco.getCidade());
		this.setEstado(endereco.getEstado());
		this.setComplemento(endereco.getComplemento());
		this.setId(endereco.getId());		

	}

	
	private Long id;

	private String rua;
	 
	private String numero;
	 
	private String complemento;
	 
	private String cidade;
	 
	private String estado;
	 
	private String cep;

}
