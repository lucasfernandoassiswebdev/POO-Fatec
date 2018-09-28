package exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private String codigo;
    private ArrayList<Curso> cursos = new ArrayList<>();
    private ArrayList<Topico> topicos = new ArrayList<>();

    public Disciplina() {
    }

    public Disciplina(String codigo) {
        this.codigo = codigo;
    }

    public void adicionaTopico(Topico p) {
        this.topicos.add(p);
    }

    public void adicionaTopico(ArrayList<Topico> lista) {
        this.topicos.addAll(lista);
    }

    public boolean removeTopico(Topico t) {
        for (Topico to : topicos) {
            if (to.getAssunto().equals(t.getAssunto())) {
                topicos.remove(topicos.indexOf(to));
                return true;
            }
        }

        return false;
    }

    public boolean removeTopico(String assunto) {
        for (Topico to : topicos) {
            if (to.getAssunto().equals(assunto)) {
                topicos.remove(topicos.indexOf(to));
                return true;
            }
        }

        return false;
    }

    public Topico obterTopico(Topico t) {
        for (Topico to : topicos) {
            if (to.getAssunto().equals(t.getAssunto())) {
                return to;
            }
        }

        return null;
    }

    public Topico obterTopico(String assunto) {
        for (Topico to : topicos) {
            if (to.getAssunto().equals(assunto)) {
                return to;
            }
        }

        return null;
    }

    public int obterPosicaoTopico(Topico t) {
        for (Topico to : topicos) {
            if (to.getAssunto().equals(t.getAssunto())) {
                return topicos.indexOf(to);
            }
        }

        return 0;
    }

    public int obterPosicaoTopico(String assunto) {
        for (Topico to : topicos) {
            if (to.getAssunto().equals(assunto)) {
                return topicos.indexOf(to);
            }
        }

        return 0;
    }

    public boolean atualizaTopico(Topico t, Topico newTopico) {
        for (Topico to : topicos) {
            if (to.getAssunto().equals(t.getAssunto())) {
                topicos.set(topicos.indexOf(to), newTopico);
                return true;
            }
        }

        return false;
    }

    // <editor-fold defaultstate="collapsed" desc="Getters e Setters">
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = new ArrayList<>(cursos);
    }

    public ArrayList<Topico> getTopico() {
        return topicos;
    }

    public void setTopico(List<Topico> topico) {
        this.topicos = new ArrayList<>(topico);
    }
    // </editor-fold>

    @Override
    public String toString() {
        return "\n    Disciplina = {\n        " + "Código = " + codigo + (this.topicos != null && !this.topicos.isEmpty()
                ? this.topicos.toString()
                : "") + '}';
    }
}
