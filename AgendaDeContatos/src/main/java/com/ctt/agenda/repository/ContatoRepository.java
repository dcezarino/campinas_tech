package com.ctt.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ctt.agenda.entity.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

}