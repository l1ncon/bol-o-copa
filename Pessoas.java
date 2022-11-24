/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.otaviolube.model;

/**
 *
 * @author alunodev10
 */
public class Pessoas {
    private TipoPessoa tipo;

    public Pessoas(TipoPessoa tipo) {
        this.tipo = tipo;
    }

    public TipoPessoa getTipo() {
        return tipo;
    }

    public void setTipo(TipoPessoa tipo) {
        this.tipo = tipo;
    }
}
