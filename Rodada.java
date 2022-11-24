/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.otaviolube.model;

/**
 *
 * @author alunodev10
 */
public class Rodada {
    private Partida[] partida;

    public Rodada(Partida[] partida) {
        this.partida = partida;
    }

    public Partida[] getPartida() {
        return partida;
    }

    public void setPartida(Partida[] partida) {
        this.partida = partida;
    }
}
