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
public class Vendedor extends Funcionario {

    private float comissao;

    public Vendedor(float comissao, String nome, int codigo, String departamento, float salario) {
        super(nome, codigo, departamento, salario);
        this.comissao = comissao;
    }

    public float calcularSalario() {
        return this.getSalario() + this.comissao;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
}
