package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Onibus {

    private String numero;

    private ArrayList<Passageiro> passageiros = new ArrayList<Passageiro>();

    public Onibus() {
    }

    public Onibus(String numero) {
        this.numero = numero;
    }

    // <editor-fold defaultstate="collapsed" desc="Passageiros">
    public void adicionaPassageiro(Passageiro p) {
        this.passageiros.add(p);
    }

    public void adicionaPassageiro(List<Passageiro> lista) {
        this.passageiros.addAll(lista);
    }

    public boolean removePassageiro(Passageiro p) {
        for (Passageiro pa : passageiros) {
            if (p.getRg().equals(pa.getRg())) {
                this.passageiros.remove(this.passageiros.indexOf(p));
                return true;
            }
        }

        return false;
    }

    public Passageiro obterPassageiro(String rg) {
        for (Passageiro pa : passageiros) {
            if (pa.getRg().equals(rg)) {
                return pa;
            }
        }

        return null;
    }

    public Passageiro obterPassageiro(Passageiro p) {
        for (Passageiro pa : passageiros) {
            if (pa.getRg().equals(p.getRg())) {
                return pa;
            }
        }

        return null;
    }

    public int obterPosicaoPassageiro(String rg) {
        for (Passageiro p : passageiros) {
            if (p.getRg().equals(rg)) {
                return p.getPoltrona();
            }
        }

        return 0;
    }

    public int obterPosicaoPassageiro(Passageiro p) {
        return p.getPoltrona();
    }

    public boolean atualizaPassageiro(Passageiro p) {
        for (Passageiro pa : passageiros) {
            if (pa.getRg().equals(p.getRg())) {
                this.passageiros.set(this.passageiros.indexOf(pa), p);
                return true;
            }
        }

        return false;
    }
    // </editor-fold>    

    // <editor-fold defaultstate="collapsed" desc="Getters e Setters">
    public int getQtdePassageiros() {
        return passageiros.size();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public List<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(List<Passageiro> passageiros) {
        this.passageiros = new ArrayList<>(passageiros);
    }
    // </editor-fold>    

    @Override
    public String toString() {
        return "\n      Onibus{" + "\n          Número=" + numero + "\n          Quantidade de Passageiros = " + getQtdePassageiros() + "\n          Passageiros=" + passageiros.toString() + "}";
    }
}
