package com.bcopstein.entidades;

public class Endereco {
    private String logradouro;
    private String numero;
    private String complemento;
    private String cep;
    private String pais;

    private Endereco(String logradouro, String numero, String complemento, String cep, String pais) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.pais = pais;
    }

    public static Endereco criaEnderecoBrasileiro(String logradouro,String numero,String complemento,String cep){
        return new Endereco(logradouro,numero,complemento,cep,"Brasil");
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getCep() {
        return cep;
    }

    public String getPais() {
        return pais;
    }

    public String formatoSimples(){
        return logradouro+", "+numero+", "+complemento+". CEP: "+cep;
    }
    
    @Override
    public String toString() {
        return "Endereco [cep=" + cep + ", complemento=" + complemento + ", logradouro=" + logradouro + ", numero="
                + numero + ", pais=" + pais + "]";
    }
}