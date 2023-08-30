/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulasjava.aula3;

/**
 *
 * @author Dell
 */
public class Figura {
    private int dimensao1;
    private int dimensao2;

    public Figura(int dimensao1, int dimensao2) {
        this.dimensao1 = dimensao1;
        this.dimensao2 = dimensao2;
    }

    public int getDimensao1() {
        return dimensao1;
    }

    public int getDimensao2() {
        return dimensao2;
    }
    
    
    
    public int calcularArea() {
        return 40;
    }
}
