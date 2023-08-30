/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulasjava.aula3;

/**
 *
 * @author Dell
 */
public class Aluno extends Pessoa {
    private String curso;
    private int ano;
    private String turma;

    public Aluno(String curso, int ano, String turma, String nome, int idade, String endereco, String genero) {
        super(nome, idade, endereco, genero);
        this.curso = curso;
        this.ano = ano;
        this.turma = turma;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
    
    
    public String todosDados() {
        return "Aluno{" + "curso=" + this.curso + ", ano=" + this.ano + ", turma=" + this.turma + ", Nome:" + super.getNome() + '}';
    }
}
