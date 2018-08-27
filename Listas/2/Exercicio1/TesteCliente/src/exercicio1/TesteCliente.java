/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import clientejar.Cliente;

/**
 *
 * @author 1090481711022
 */
public class TesteCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente Fulano = new Cliente();
        Fulano.setNumeroConta("1234-567");
        Fulano.setNumeroAgencia("12-345");
        Fulano.setNome("Fulano");
        Fulano.setSaldo(2800);
        Fulano.realizarDeposito(500);
        Fulano.realizarSaque(200);
        System.out.println(Fulano.toString());

        Cliente Beltrano = new Cliente("6321-765", "54-421", "Beltrano", 600);
        Beltrano.realizarDeposito(1000);
        Beltrano.realizarSaque(100);
        System.out.println(Beltrano.toString());
    }

}
