/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulasjava.aula3;

/**
 *
 * @author Dell
 */
public class Quadrado extends Figura {

    public Quadrado(int lado) {
        super(lado, lado);
    }
    
    public int calcularArea() {
        return super.getDimensao1() * super.getDimensao2();
    }
}
