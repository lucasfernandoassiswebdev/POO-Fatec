package exercicio1;

public class TestaPassageiro {

    public static void main(String[] args) {
        Voo v1 = new Voo("629-A", "São-Paulo");
        Reserva r1 = new Reserva(444, v1);
        Passageiro p1 = new Passageiro("Lucas", r1);
        System.out.println(p1.toString());
    }
}
