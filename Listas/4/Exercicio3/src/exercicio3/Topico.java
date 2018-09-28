package exercicio3;

import java.util.ArrayList;

public class Topico {

    private String assunto;
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();
    
    public Topico() {
    }

    public Topico(String assunto) {
        this.assunto = assunto;
    }
        
    // <editor-fold defaultstate="collapsed" desc="Getters e Setters">
    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }        
    // </editor-fold>

    @Override
    public String toString() {
        return "\n            Topico{\n" + "                assunto = " + assunto + "\n            }";
    }
}
