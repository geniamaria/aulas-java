/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulasjava.aula3;

/**
 *
 * @author Dell
 */
public class Triangulo extends Figura {
    
    public Triangulo(int base, int altura) {
        super(base, altura);
    }
    
    public int calcularArea() {
        return (super.getDimensao1() * super.getDimensao2()) / 2;
    }
    
    
    
    public void imprimirArea() {
        System.out.println("A area e: " + super.calcularArea());
    }
}
