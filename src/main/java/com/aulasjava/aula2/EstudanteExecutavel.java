/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.aulasjava.aula2;

/**
 *
 * @author Dell
 */
public class EstudanteExecutavel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] cadeiras = {"Cadeira1", "Cadeira2"};
       
       Estudante maria = new Estudante(cadeiras);
       
       System.out.println(maria.getCadeiras()[0]);
    }
    
}
