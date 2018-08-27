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
public class TestaCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, 2, "Fulano", 500);
        cliente.realizarDeposito(500);
        cliente.realizarSaque(200);
        System.out.println(cliente.dadosConta());

        cliente = new Cliente(2, 1, "Beltrano", 100);
        cliente.realizarDeposito(100);
        cliente.realizarSaque(10);
        System.out.println(cliente.dadosConta());
    }
}
