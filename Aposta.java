/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.otaviolube.model;

/**
 *
 * @author alunodev10
 */
public class Aposta {
    private Rodadas[] rodadas;

    public Aposta(Rodadas[] rodadas) {
        this.rodadas = rodadas;
    }

    public Rodadas[] getRodadas() {
        return rodadas;
    }

    public void setRodadas(Rodadas[] rodadas) {
        this.rodadas = rodadas;
    }
}
