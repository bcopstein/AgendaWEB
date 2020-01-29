package com.bcopstein.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Veiculo {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String placa;
    private int ano;
    private String marca;
    private String modelo;

    protected Veiculo(){}

    public Veiculo(String placa, int ano, String marca, String modelo) {
        this.placa = placa;
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Long getId() {
        return id;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Veiculo [ano=" + ano + ", id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", placa=" + placa
                + "]";
    }
}