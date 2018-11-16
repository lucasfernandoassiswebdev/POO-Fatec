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
public class Funcionario {
    protected String nome;
    protected int codigo;
    protected String departamento;
    protected float salario;

    public Funcionario(String nome, int codigo, String departamento, float salario) {
        this.nome = nome;
        this.codigo = codigo;
        this.departamento = departamento;
        this.salario = salario;
    }
            
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", codigo=" + codigo + ", departamento=" + departamento + ", salario=" + salario + '}';
    }
}
