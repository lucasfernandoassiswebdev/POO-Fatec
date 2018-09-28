package exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nome;
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public Curso() {
    }

    public Curso(String nome) {
        this.nome = nome;
    }

    public void adicionaDisciplina(Disciplina d) {
        disciplinas.add(d);
    }

    public boolean removeDisciplina(String codigo) {
        for (Disciplina di : disciplinas) {
            if (di.getCodigo().equals(codigo)) {
                disciplinas.remove(disciplinas.indexOf(di));
                return true;
            }
        }

        return false;
    }

    public boolean removeDisciplina(Disciplina d) {
        for (Disciplina di : disciplinas) {
            if (di.getCodigo().equals(d.getCodigo())) {
                disciplinas.remove(disciplinas.indexOf(di));
                return true;
            }
        }

        return false;
    }

    public boolean associaTopicoDisciplina(Disciplina d, Topico t) {
        for (Disciplina di : disciplinas) {
            if (di.getCodigo().equals(d.getCodigo())) {
                d.adicionaTopico(t);
                return true;
            }
        }

        return false;
    }

    public boolean desvinculaTopicoDisciplina(Disciplina d, Topico t) {
        for (Disciplina di : disciplinas) {
            if (di.getCodigo().equals(d.getCodigo())) {
                d.removeTopico(t);
                return true;
            }
        }

        return false;
    }

    public List<Topico> obterTopicosDisciplina(Disciplina d) {
        return d.getTopico();
    }

    public Disciplina obterDisciplina(Disciplina d) {
        for (Disciplina di : disciplinas) {
            if (di.getCodigo().equals(d.getCodigo())) {
                return di;
            }
        }

        return null;
    }

    public Disciplina obterDisciplina(String codigo) {
        for (Disciplina di : disciplinas) {
            if (di.getCodigo().equals(codigo)) {
                return di;
            }
        }

        return null;
    }

    public int obterPosicaoDisciplina(Disciplina d) {
        for (Disciplina di : disciplinas) {
            if (di.getCodigo().equals(d.getCodigo())) {
                return disciplinas.indexOf(di);
            }
        }

        return 0;
    }

    public int obterPosicaoDisciplina(String codigo) {
        for (Disciplina di : disciplinas) {
            if (di.getCodigo().equals(codigo)) {
                return disciplinas.indexOf(di);
            }
        }

        return 0;
    }

    public boolean atualizaDisciplina(Disciplina d) {
        for (Disciplina di : disciplinas) {
            if (di.getCodigo().equals(d.getCodigo())) {
                disciplinas.set(disciplinas.indexOf(di), d);

                return true;
            }
        }

        return false;
    }

    // <editor-fold defaultstate="collapsed" desc="Getters e Setters">
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = new ArrayList<>(disciplinas);
    }
    // </editor-fold>

    @Override
    public String toString() {
        return "Curso{" + "\n    Nome = " + nome + (this.disciplinas != null && !this.disciplinas.isEmpty()
                ? this.disciplinas.toString()
                : "") + '}';
    }
}
