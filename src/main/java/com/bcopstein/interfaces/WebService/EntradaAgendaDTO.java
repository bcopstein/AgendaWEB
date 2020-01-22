package com.bcopstein.interfaces.WebService;

import java.util.Calendar;

import com.bcopstein.entidades.EntradaAgenda;

public class EntradaAgendaDTO {
    private String nome;
    private String sobrenome;
    private String endereco;
    private String telefone;
    private String dataNascimento;

    public EntradaAgendaDTO(String nome, String sobrenome, String endereco, String telefone, String dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }
    
    public static EntradaAgendaDTO fromEntradaAgenda(EntradaAgenda ea){
        return new EntradaAgendaDTO(
            ea.getNome(),
            ea.getSobreNome(),
            ea.getEndereco().formatoSimples(),
            ea.getTelefone().formatoSimples(),
            ea.getDataDeNascimento().get(Calendar.DAY_OF_MONTH)+"/"+
            ea.getDataDeNascimento().get(Calendar.MONTH)+"/"+
            ea.getDataDeNascimento().get(Calendar.YEAR));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}