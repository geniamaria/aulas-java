/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulasjava.aula1;

/**
 *
 * @author Dell
 */
public class FabricaCarro {
    private String marca;
    private String modeloCarro;
    private String cor;
    private int ano;
    
    public FabricaCarro(String marca, String modeloCarro, String cor, int ano) {
        this.marca = marca;
        this.modeloCarro = modeloCarro;
        this.cor = cor;
        this.ano = ano;
    }
    
    public FabricaCarro(String cor, int ano) {
        this.cor = cor;
        this.ano = ano;
    }
    
    public FabricaCarro(String marca, String modeloCarro, int ano) {
        this.marca = marca;
        this.modeloCarro = modeloCarro;
        this.ano = ano;
    }
    
    //getters
    public String getMarca() {
        return this.marca;
    }
    
    public String getModeloCarro() {
        return this.modeloCarro;
    }
    
    //......
    
    //setters
    public void setMarca(String novaMarca) {
        this.marca = novaMarca;
    }
    
    public void setModeloCarro(String novoModeloCarro) {
        this.modeloCarro = novoModeloCarro;
    }
    
    
    public String toString() {
        return """
                Marca:
                Modelo:
                Cor:
                Ano:
               """;
    }
}
