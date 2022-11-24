/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.otaviolube.model;

/**
 *
 * @author alunodev10
 */
public class Partida {
    private int golsMandante; 

    public Partida(int golsMandante, int golsVisitante, Deletime tempo) {
        this.golsMandante = golsMandante;
        this.golsVisitante = golsVisitante;
        this.tempo = tempo;
    }
    
    private int golsVisitante;
    
    private Deletime tempo;

    public int getGolsMandante() {
        return golsMandante;
    }

    public void setGolsMandante(int golsMandante) {
        this.golsMandante = golsMandante;
    }

    public int getGolsVisitante() {
        return golsVisitante;
    }

    public void setGolsVisitante(int golsVisitante) {
        this.golsVisitante = golsVisitante;
    }

    public Deletime getTempo() {
        return tempo;
    }

    public void setTempo(Deletime tempo) {
        this.tempo = tempo;
    }
    
}
