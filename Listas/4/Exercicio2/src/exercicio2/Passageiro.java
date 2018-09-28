package exercicio2;

public class Passageiro {

    private String rg;
    private String nome;
    private int poltrona;

    public Passageiro() {
    }

    public Passageiro(String rg, String nome, int poltrona) {
        this.rg = rg;
        this.nome = nome;
        this.poltrona = poltrona;
    }

    // <editor-fold defaultstate="collapsed" desc="Getters e Setters">
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }
    // </editor-fold>

    @Override
    public String toString() {
        return "\n            Passageiro{" + "\n               RG = " + rg + "\n               Nome = " + nome + "\n               Poltrona = " + poltrona + "\n            }";
    }
}
