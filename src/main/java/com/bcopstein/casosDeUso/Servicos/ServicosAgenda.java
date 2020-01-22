package com.bcopstein.casosDeUso.Servicos;

import com.bcopstein.casosDeUso.Repositorios.RepositorioAgenda;
import com.bcopstein.entidades.EntradaAgenda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Corresponde a fachada dos casos de uso da agenda

// Precisa gerar excecoes de negocio. Exemplos: nome inexistente
@Service
public class ServicosAgenda {
    RepositorioAgenda repositorioAgenda;

    @Autowired
    public ServicosAgenda(RepositorioAgenda repositorioAgenda){
        this.repositorioAgenda = repositorioAgenda;
    }

    public EntradaAgenda recuperaPorNomeCompleto(String nome,String sobreNome){
        return repositorioAgenda.recuperaPorNomeSobreNome(nome, sobreNome);
    }
}