package exercicio1;

public class Voo {

    private String numero, destino;

    public Voo() {
    }

    public Voo(String numero, String destino) {
        this.numero = numero;
        this.destino = destino;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Getters e Setters">
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    // </editor-fold>

    @Override
    public String toString() {
        return "Voo{" + "numero=" + numero + ", destino=" + destino + '}';
    }        
}
