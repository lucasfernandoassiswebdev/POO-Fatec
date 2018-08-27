/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadorjar;

/**
 *
 * @author LUCASFERNANDODEASSIS
 */
public class Computador {
    private String processador;
    private static int ram;

    public Computador() {
    }

    public Computador(String processador) {
        this.processador = processador;
    }
    
    public String getProcessador(){
        return this.processador;
    }
    
    public void setProcessador(String processador){
        this.processador = processador;
    }
    
    public static int getRam(){
        return Computador.ram;
    }
    
    public static void alteraRam(int novo_valor){
        Computador.ram = novo_valor;
    }
    
    public static void upgradeMemoria(){
        Computador.ram += 256;
    }
}
