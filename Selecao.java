/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.otaviolube.model;

/**
 *
 * @author alunodev10
 */
public class Selecao {
    private String nome;

    public Selecao(String nome, String tecnico) {
        this.nome = nome;
        this.tecnico = tecnico;
    }
    
    private String tecnico;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }
}
