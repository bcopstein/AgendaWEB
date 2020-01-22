package com.bcopstein.casosDeUso.Repositorios;

import com.bcopstein.entidades.EntradaAgenda;

public interface RepositorioAgenda {
    EntradaAgenda recuperaPorNomeSobreNome(String nome,String sobreNome);
}