package com.ctt.agenda.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ctt.agenda.dto.input.EnderecoDtoInput;
import com.ctt.agenda.dto.output.EnderecoDtoOutput;
import com.ctt.agenda.entity.Endereco;

@Service
public class EnderecoConverter {

	public Endereco dtoToModel(EnderecoDtoInput enderecoDtoInput) {
		Endereco endereco = new Endereco();
		return this.dtoToModel(enderecoDtoInput, endereco);
	}

	public Endereco dtoToModel(EnderecoDtoInput enderecoDtoInput, Endereco endereco) {
		endereco.setCep(enderecoDtoInput.getCep());
		endereco.setRua(enderecoDtoInput.getRua());
		endereco.setNumero(enderecoDtoInput.getNumero());
		endereco.setCidade(enderecoDtoInput.getCidade());
		endereco.setEstado(enderecoDtoInput.getEstado());
		endereco.setComplemento(enderecoDtoInput.getComplemento());
		return endereco;
	}

	public EnderecoDtoOutput modelToDto(Endereco endereco) {
		EnderecoDtoOutput enderecoDtoOutput = new EnderecoDtoOutput();
		enderecoDtoOutput.setCep(endereco.getCep());
		enderecoDtoOutput.setRua(endereco.getRua());
		enderecoDtoOutput.setNumero(endereco.getNumero());
		enderecoDtoOutput.setCidade(endereco.getCidade());
		enderecoDtoOutput.setEstado(endereco.getEstado());
		enderecoDtoOutput.setComplemento(endereco.getComplemento());
		enderecoDtoOutput.setId(endereco.getId());
		return enderecoDtoOutput;
	}

	public List<EnderecoDtoOutput> modelToDto(List<Endereco> enderecos) {
		List<EnderecoDtoOutput> enderecosDtos = new ArrayList<EnderecoDtoOutput>();
		for (Endereco endereco : enderecos) {
			enderecosDtos.add(this.modelToDto(endereco));
		}
		return enderecosDtos;
	}

}
