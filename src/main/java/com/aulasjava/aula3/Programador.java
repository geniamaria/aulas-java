/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulasjava.aula3;

/**
 *
 * @author Dell
 */
public class Programador extends Pessoa {
    String linguagem;
    String projecto;

    public Programador(String linguagem, String projecto, String nome, int idade, String endereco, String genero) {
        super(nome, idade, endereco, genero);
        this.linguagem = linguagem;
        this.projecto = projecto;
    }


    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public String getProjecto() {
        return projecto;
    }

    public void setProjecto(String projecto) {
        this.projecto = projecto;
    }
    
    
}
