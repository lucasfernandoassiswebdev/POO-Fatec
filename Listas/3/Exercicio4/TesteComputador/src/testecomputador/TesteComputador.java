/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testecomputador;

import computadorjar.Computador;

/**
 *
 * @author LUCASFERNANDODEASSIS
 */
public class TesteComputador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computador my_computer = new Computador("I5 3ª Geração");
        Computador.alteraRam(2048);
        System.out.println("Processador atual: " + my_computer.getProcessador());
        System.out.println("Memória RAM atual: " + my_computer.getRam() + "MB");
        my_computer.upgradeMemoria();
        my_computer.setProcessador("I7 7ª Geração");
        System.out.println("Update:");
        System.out.println("Memória RAM atual: " + my_computer.getRam() + "MB");
        System.out.println("Processador atual: " + my_computer.getProcessador());
    }
}
