/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_4;

/**
 *
 * @author 1090481711022
 */
public class TestaRio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rio rio = new Rio();
        rio.setNome("Tietê");
        rio.setNivel(50);
        rio.sujar();
        System.out.println(rio.mostra());
        
        rio = new Rio("Canoas", 120, false);
        System.out.println(rio.mostra());
    }
    
}
