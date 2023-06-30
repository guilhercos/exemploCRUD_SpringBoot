package com.exampleapi.demo.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exampleapi.demo.entidade.Contato;

public interface Repositorio extends JpaRepository<Contato, Long>{
}
