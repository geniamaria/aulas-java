/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.aulasjava.aula2;
import com.aulasjava.aula2.Pessoa;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class PessoaExecutavel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa[] listaPessoas = new Pessoa[2];
        
        Scanner teclado = new Scanner(System.in);
        

        for(int j = 1; j <= listaPessoas.length; j++) {
            System.out.println("Diggite o nome da " + j + " pessoa:");
            String nome = teclado.nextLine();
            System.out.println("Diggite a idade da " + j + " pessoa:");
            int idade = Integer.parseInt(teclado.nextLine());
            System.out.println("Diggite a profissao da " + j + " pessoa:");
            String profissao = teclado.nextLine();
            
            listaPessoas[j - 1] = new Pessoa(nome, idade, profissao);
        }

        System.out.println("\n\n=====Lista das peessoas cadastradas=====\n");
        for(int i = 0; i < listaPessoas.length; i++) {
            System.out.println("Nome: " + listaPessoas[i].getNome() 
                            + "\nIdade: " + listaPessoas[i].getIdade() 
                            + "\nProfissao: " + listaPessoas[i].getProfissao() + "\n\n");
        }

        /*
        String[] nomes = new String[4];
        
        String nome1 = "Fred";
        String nome2 = "Paulo";
        String nome3 = "Joao";
        String nome4 = "Baciquete";
        
        nomes[0] = nome1;
        nomes[1] = nome2;
        nomes[2] = nome3;
        nomes[3] = nome4;
        
        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
        */
    }
    
}
