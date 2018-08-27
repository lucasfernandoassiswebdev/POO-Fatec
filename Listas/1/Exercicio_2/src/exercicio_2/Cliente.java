/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_2;

/**
 *
 * @author 1090481711022
 */
public class Cliente {

    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int numeroConta;
    public int numeroAgencia;
    public String nome;
    public float saldo;

    public void realizarDeposito(float valorDeposito) {
        this.saldo += valorDeposito;
    }

    public void realizarSaque(float valorSaque) {
        this.saldo -= valorSaque;
    }

    public String dadosConta() {
        return "\n  Número da conta: " + this.numeroConta
                + "\n  Nome do cliente: " + this.nome
                + "\n  Saldo atual: " + this.saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
