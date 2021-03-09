package com.ctt.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ctt.agenda.entity.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {

}