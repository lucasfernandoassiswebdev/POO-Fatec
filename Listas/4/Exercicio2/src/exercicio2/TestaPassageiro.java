package exercicio2;

import java.util.Arrays;
import java.util.List;

public class TestaPassageiro {
    
    public static void main(String[] args) {
        Passageiro p1 = new Passageiro("5264361523", "Lucas", 1);
        Passageiro p2 = new Passageiro("5612433241", "Joylson", 2);
        Passageiro p3 = new Passageiro("8798998797", "Gabriel", 3);
        Passageiro p4 = new Passageiro("82572321168", "João", 4);
        Passageiro p5 = new Passageiro("86734443528", "Amanda", 4);
        
        Rodoviaria r1 = new Rodoviaria("Rodoviária do Joylson", "Franca SP");
        Rodoviaria r2 = new Rodoviaria("Rodoviária do Lucas", "Ribeirão Preto SP");
        Rodoviaria r3 = new Rodoviaria("Rodoviária do Daniel", "Américo SP");
        
        Onibus o1 = new Onibus("1");
        Onibus o2 = new Onibus("2");
        Onibus o3 = new Onibus("3");
        
        o1.setPassageiros(Arrays.asList(p1, p2));
        o2.setPassageiros(Arrays.asList(p3));
        o3.setPassageiros(Arrays.asList(p4, p5));
        
        r1.setOnibus(Arrays.asList(o1, o2, o3));
        r2.setOnibus(Arrays.asList(o2, o3));
        r3.setOnibus(Arrays.asList(o1));

        //r1.removerOnibus(o1);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());
        
        System.out.println("-------------------------------------------------");
        
        o1.setNumero("50");        
        o1.adicionaPassageiro(Arrays.asList(p3, p4, p5));
        
        r1.atualizaOnibus(o1);
        System.out.println(o1.toString());
        
        System.out.println("-------------------------------------------------");
        
        r1.removerOnibus(o1);
        System.out.println(r1.toString());
    }
    
}
