/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio_1;

/**
 *
 * @author 1090481711022
 */
public class Aluno {

    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    public int numeroAluno;
    public String nome;
    public int idade;
    public float p1;
    public float p2;

    public float notaFinal() {
        return (p1 + p2) / 2;
    }

    public String dadosAluno() {
        return "Número do aluno: " + this.numeroAluno
                + "\nNome do aluno: " + this.nome
                + "\nIdade do aluno: " + this.idade + "\n";
    }

    public boolean passou() {
        return notaFinal() > 7;
    }

    public int getNumeroAluno() {
        return numeroAluno;
    }

    public void setNumeroAluno(int numeroAluno) {
        this.numeroAluno = numeroAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        this.p1 = p1;
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        this.p2 = p2;
    }
}
