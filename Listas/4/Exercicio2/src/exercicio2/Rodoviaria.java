package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Rodoviaria {

    private String nome;
    private String cidade;

    private ArrayList<Onibus> onibus = new ArrayList<>();

    public Rodoviaria() {
    }

    public Rodoviaria(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public void adicionarOnibus(Onibus o) {
        this.onibus = new ArrayList<>(onibus);
        this.onibus.add(o);
    }

    public void adicionarOnibus(List<Onibus> lista) {
        this.onibus.addAll(lista);
    }

    public void adicionarPassageiroOnibus(Passageiro p, Onibus o) {
        o.adicionaPassageiro(p);
    }

    public boolean removerOnibus(Onibus o) {
        for (Onibus on : onibus) {
            if (on.getNumero().equals(o.getNumero())) {
                onibus.remove(onibus.indexOf(on));
                return true;
            }
        }

        return false;
    }

    public boolean removerPassageiroOnibus(Passageiro p, Onibus o) {
        return o.removePassageiro(p);
    }

    public Onibus obterOnibus(Onibus o) {
        for (Onibus on : onibus) {
            if (on.getNumero().equals(o.getNumero())) {
                return on;
            }
        }

        return null;
    }

    public int obterPosicaoOnibus(Onibus o) {
        for (Onibus on : onibus) {
            if (on.getNumero().equals(o.getNumero())) {
                return this.onibus.indexOf(on);
            }
        }

        return 0;
    }

    public int obterPosicaoOnibus(int numero) {
        for (Onibus on : onibus) {
            if (on.getNumero().equals(numero)) {
                return this.onibus.indexOf(on);
            }
        }

        return 0;
    }

    public boolean atualizaOnibus(Onibus o) {
        for (Onibus on : onibus) {
            if (on.getNumero().equals(o.getNumero())) {
                this.onibus.set(this.onibus.indexOf(on), o);
                return true;
            }
        }

        return false;
    }

    public boolean atualizaPassageiroOnibus(Onibus o, Passageiro p) {
        return o.atualizaPassageiro(p);
    }

    // <editor-fold defaultstate="collapsed" desc="Getters e Setters">
    public int getQtdeOnibus() {
        return onibus.size();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public List<Onibus> getOnibus() {
        return onibus;
    }

    public void setOnibus(List<Onibus> onibus) {
        this.onibus = new ArrayList<>(onibus);
    }
    // </editor-fold>

    @Override
    public String toString() {
        return "Rodoviaria{\n   Nome = " + nome + "\n   Quantidade de Ônibus = " + getQtdeOnibus() + "\n   Cidade = " + cidade + "\n   Ônibus = " + onibus.toString() + "}";
    }
}
