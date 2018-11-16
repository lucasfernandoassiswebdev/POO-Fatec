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
public class Gerente extends Funcionario {

    private float bonus;

    public Gerente(float bonus, String nome, int codigo, String departamento, float salario) {
        super(nome, codigo, departamento, salario);
        this.bonus = bonus;
    }

    public float calcularSalario() {
        return this.getSalario() + this.bonus;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Gerente{" + "bonus=" + bonus + '}';
    }        
}
