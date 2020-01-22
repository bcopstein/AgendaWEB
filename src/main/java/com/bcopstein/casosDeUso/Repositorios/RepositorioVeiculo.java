package com.bcopstein.casosDeUso.Repositorios;

import java.util.List;

import com.bcopstein.entidades.Veiculo;

import org.springframework.data.repository.CrudRepository;

public interface RepositorioVeiculo extends CrudRepository<Veiculo, Long> {

    List<Veiculo> findByModelo(String Modelo);
    Veiculo findById(long Id);
  }