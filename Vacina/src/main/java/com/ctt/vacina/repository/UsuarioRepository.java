package com.ctt.vacina.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ctt.vacina.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	// Queries que executam os selects no banco
	// Convertido em tempo de execução para queries
	public Optional <Usuario> findByEmail(String email);
	
	public Optional <Usuario> findByCpf(String cpf);

}

