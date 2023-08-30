/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.aulasjava.aula3;

/**
 *
 * @author Dell
 */
public class Executavel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
            Aluno joao = new Aluno("ETSI", 2, "Turma 2", "Joao Paulo", 21, "AV. www", "Masculino");
        
            System.out.println("====DADOS DO ALUNO====\n");
            System.out.println(joao.todosDados());
        */
        
        Triangulo meuTriangulo = new Triangulo(10, 2);
        meuTriangulo.imprimirArea();
    }
}
