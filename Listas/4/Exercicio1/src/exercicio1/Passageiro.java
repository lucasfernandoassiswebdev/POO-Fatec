package exercicio1;

public class Passageiro {
    private String nome;
    private Reserva reserva;

    public Passageiro() {
    }

    public Passageiro(String nome, Reserva reserva) {
        this.nome = nome;
        this.reserva = reserva;
    }

    // <editor-fold defaultstate="collapsed" desc="Getters e Setters">
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    // </editor-fold>

    @Override
    public String toString() {
        return "Passageiro{" + "nome=" + nome + ", reserva=" + reserva + '}';
    }        
}
