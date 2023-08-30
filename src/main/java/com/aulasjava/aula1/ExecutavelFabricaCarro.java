/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.aulasjava.aula1;
import com.aulasjava.aula1.FabricaCarro;

/**
 *
 * @author Dell
 */

public class ExecutavelFabricaCarro {
    
    public static void main(String[] args) {
  
       FabricaCarro carroUbisse = new FabricaCarro("Toyota", "Vitz", "Azul", 2023);
       FabricaCarro carroJenny = new FabricaCarro("Azul", 2023);
       FabricaCarro carroMaria = new FabricaCarro("BMW", "X5", 2023);
       
       /*
        System.out.println("A marca do carro do Ubisse e: " + carroUbisse.getMarca());
       System.out.println("A marca do carro da Jenny e: " + carroJenny.getMarca());
       System.out.println("A marca do carro da Maria e: " + carroMaria.getMarca());
       
       System.out.println("\n=====Dados Actualizados======\n");
       carroJenny.setMarca("Mercedes");
       System.out.println("A marca do carro do Ubisse e: " + carroUbisse.getMarca());
       System.out.println("A marca do carro da Jenny e: " + carroJenny.getMarca());
       System.out.println("A marca do carro da Maria e: " + carroMaria.getMarca());
       */
       
    }
}
