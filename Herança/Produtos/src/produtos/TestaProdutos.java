/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtos;

/**
 *
 * @author LUCASFERNANDODEASSIS
 */
public class TestaProdutos {
    public static void main(String[] args) {
        Radio r1 = new Radio(1, 250, "teste", 2);
        TV t1 = new TV(2, 550, "Canal A");
                        
        System.out.println(r1.toString());
        System.out.println(t1.toString());
        
        System.out.println(r1.mexer("banda 5"));
        System.out.println(t1.mexer("Canal B"));
        
        System.out.println(r1.toString());
        System.out.println(t1.toString());
    }
}
