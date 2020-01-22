package com.bcopstein.entidades;

import java.util.GregorianCalendar;

public class EntradaAgenda {
    private String id;
    private String nome;
    private String sobreNome;
    private Endereco endereco;
    private Telefone telefone;
    private GregorianCalendar dataDeNascimento;

    public EntradaAgenda(String id, String nome, String sobreNome, Endereco endereco, Telefone telefone,
            GregorianCalendar dataDeNascimento) {
        this.id = id;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public GregorianCalendar getDataDeNascimento() {
        return dataDeNascimento;
    }

    @Override
    public String toString() {
        return "EntradaAgenda [dataDeNascimento=" + dataDeNascimento + ", endereco=" + endereco + ", id=" + id
                + ", nome=" + nome + ", sobreNome=" + sobreNome + ", telefone=" + telefone + "]";
    }
}