package com.bcopstein.entidades;

public class Telefone {
    public enum Tipo {Celular, Residencial, Trabalho}
    private int ddd;
    private String numero;
    private Tipo tipo;

    private Telefone(int ddd,String numero,Tipo tipo){
        this.ddd = ddd;
        this.numero = numero;
        this.tipo = tipo;
    }

    public static Telefone criaCelular(int ddd,String numero){
        return new Telefone(ddd,numero,Tipo.Celular);
    }

    public static Telefone criaResidencial(int ddd,String numero){
        return new Telefone(ddd,numero,Tipo.Residencial);
    }

    public static Telefone criaTrabalho(int ddd,String numero){
        return new Telefone(ddd,numero,Tipo.Trabalho);
    }

    public String formatoSimples(){
        return "("+ddd+") "+numero;
    }
    
    public int getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }

    public Tipo getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Telefone [ddd=" + ddd + ", numero=" + numero + ", tipo=" + tipo + "]";
    }
}