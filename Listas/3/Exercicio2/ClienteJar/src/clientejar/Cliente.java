/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientejar;

/**
 *
 * @author LUCASFERNANDODEASSIS
 */
public class Cliente {

    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private static float saldo;

    public Cliente() {
    }

    public Cliente(String numeroConta, String numeroAgencia, String nome) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
    }

    public void realizarDeposito(float valor) {
        Cliente.saldo += valor;
    }

    public void realizarSaque(float valor) {
        Cliente.saldo -= valor;
    }

    public void alteraSaldo(float novo_valor) {
        Cliente.saldo = novo_valor;
    }

    public Cliente retornaNovoCliente(Cliente cliente_a, Cliente cliente_b) {
        Cliente.saldo *= 2;
        return new Cliente(cliente_b.getNumeroConta(), cliente_a.getNumeroAgencia(), "Fulano");
    }

    public boolean verificaTamanho(String numeroAgencia) {
        return numeroAgencia.length() == 6;
    }

    public String mostra() {
        return "\nNome do Cliente: " + nome + "\nNúmero da Conta: " + numeroConta + "\nNúmero da Agencia: " + numeroAgencia + "\nSaldo Atual: R$" + Cliente.saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static float getSaldo() {
        return saldo;
    }

    public static void setSaldo(float saldo) {
        Cliente.saldo = saldo;
    }
}
