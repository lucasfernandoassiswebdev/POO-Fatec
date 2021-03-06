package exercicio1;

public class Reserva {

    private int codigo;
    private Voo voo;

    public Reserva() {
    }

    public Reserva(int codigo, Voo voo) {
        this.codigo = codigo;
        this.voo = voo;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Getters e Setters">
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }
    // </editor-fold>

    @Override
    public String toString() {
        return "Reserva{" + "codigo=" + codigo + ", voo=" + voo + '}';
    }        
}
