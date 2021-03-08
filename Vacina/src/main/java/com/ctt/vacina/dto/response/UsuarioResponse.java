package com.ctt.vacina.dto.response;

import java.util.Date;

import com.ctt.vacina.entity.Usuario;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
// Construtor vazio
@NoArgsConstructor
public class UsuarioResponse {
	
	// Converte um usuário para ele mesmo
	// Resposta não tem validação
	public UsuarioResponse(Usuario usuario) {
		this.setId(usuario.getId());
		this.setCpf(usuario.getCpf());
		this.setDataNascimento(usuario.getDataNascimento());
		this.setEmail(usuario.getEmail());
		this.setNome(usuario.getNome());	
	}
	
	private Long id;
	
	private String cpf;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date dataNascimento;
	
	private String email;
	
	private String nome;	

}
