/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_4;

/**
 *
 * @author 1090481711022
 */
public class Rio {

    public Rio() {
    }

    public Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    public String nome;
    public float nivel;
    public boolean poluido;

    public void chover(float x) {
        this.nivel += x;
    }

    public void ensolarar(float x) {
        this.nivel -= x;
    }

    public void limpar() {
        this.poluido = false;
    }

    public void sujar() {
        this.poluido = true;
    }

    public String mostra() {
        return "Nome do rio: " + this.nome
                + "\nNível atual: " + this.nivel
                + "\nPoluído: " + (this.poluido ? "Sim" : "Não") + "\n";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNivel() {
        return nivel;
    }

    public void setNivel(float nivel) {
        this.nivel = nivel;
    }
}
