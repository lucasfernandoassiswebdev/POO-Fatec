/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testacliente;

import clientejar.Cliente;

/**
 *
 * @author LUCASFERNANDODEASSIS
 */
public class TestaCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente_1 = new Cliente("123456", "654321", "Beltrano");
        Cliente.setSaldo(8000);
        cliente_1.realizarDeposito(2000);
        cliente_1.realizarSaque(5.500f);
        System.out.println(cliente_1.mostra());
        
        Cliente cliente_2 = new Cliente("654321", "123456", "Ciclano");
        Cliente.setSaldo(500);
        cliente_2.realizarDeposito(100);
        cliente_2.realizarSaque(13);
        System.out.println(cliente_2.mostra());
        
        Cliente cliente_3 = new Cliente();
        cliente_3 = cliente_3.retornaNovoCliente(cliente_1, cliente_2);
        System.out.println(cliente_3.mostra());
    }
    
}
