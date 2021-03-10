package com.ctt.agenda.dto.output;

import com.ctt.agenda.entity.Telefone;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class TelefoneDtoOutput {

	public TelefoneDtoOutput(Telefone telefone) {
		this.setDdd(telefone.getDdd());
		this.setId(telefone.getId());
		this.setNumero(telefone.getNumero());
		this.setTipo(telefone.getTipo());
	}

	private Long id;

	private String tipo;

	private String ddd;

	private String numero;

}
