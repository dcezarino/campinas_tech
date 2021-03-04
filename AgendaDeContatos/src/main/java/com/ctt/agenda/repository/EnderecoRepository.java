package com.ctt.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ctt.agenda.entity.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {	

}
