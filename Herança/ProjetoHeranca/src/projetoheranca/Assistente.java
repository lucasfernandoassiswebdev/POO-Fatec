/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoheranca;

/**
 *
 * @author 1090481711022
 */
public class Assistente extends Funcionario {

    private String assiste;

    public Assistente(String assiste, String nome, int codigo, String departamento, float salario) {
        super(nome, codigo, departamento, salario);
        this.assiste = assiste;
    }

    public String getAssiste() {
        return assiste;
    }

    public void setAssiste(String assiste) {
        this.assiste = assiste;
    }

    @Override
    public String toString() {
        return "Assistente{" + "assiste=" + assiste + '}';
    }
}
