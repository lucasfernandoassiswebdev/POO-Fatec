/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientejar;

/**
 *
 * @author 1090481711022
 */
public class Cliente {

    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private float saldo;

    public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo) {
        trataNumeroConta(numeroConta);
        trataNumeroAgencia(numeroAgencia);
        validaNome(nome);
        this.saldo = saldo;
    }

    public Cliente() {
    }

    public void realizarDeposito(float valor) {
        this.saldo += valor;
    }

    public void realizarSaque(float valor) {
        this.saldo -= valor;
    }

    public String toString() {
        return "Número da conta: " + numeroConta
                + "\nNúmero da agência: " + numeroAgencia
                + "\nNome do cliente: " + nome
                + "\nSaldo atual: R$" + saldo + "\n";
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        trataNumeroConta(numeroConta);
    }

    private void trataNumeroConta(String numeroConta) {
        if (numeroConta.length() < 8) {
            System.out.println("O número da conta deve ter no mínimo 8 caracteres");
        } else if (numeroConta.charAt(4) != '-') {
            System.out.println("A conta deve conter o dígito verificador");
        } else {
            this.numeroConta = numeroConta;
        }
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        trataNumeroAgencia(numeroAgencia);
    }

    private void trataNumeroAgencia(String numeroAgencia) {
        if (numeroAgencia.length() < 6) {
            System.out.println("O número da agencia deve ter no mínimo 8 caracteres");
        } else if (numeroAgencia.charAt(2) != '-') {
            System.out.println("A agencia deve conter o dígito verificador");
        } else {
            this.numeroAgencia = numeroAgencia;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        validaNome(nome);
    }

    private void validaNome(String nome) {
        if (!(nome.length() > 30)) {
            this.nome = nome;
        } else {
            System.out.println("O nome deve conter menos de 30 caracteres");
        }
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
