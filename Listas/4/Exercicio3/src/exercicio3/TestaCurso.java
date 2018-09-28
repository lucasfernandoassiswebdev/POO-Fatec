package exercicio3;

import java.util.Arrays;

public class TestaCurso {

    public static void main(String[] args) {
        Topico t1 = new Topico("TOPICO A");
        Topico t2 = new Topico("TOPICO B");
        Topico t3 = new Topico("TOPICO C");
        Topico t4 = new Topico("TOPICO D");
        Topico t5 = new Topico("TOPICO E");

        Curso c1 = new Curso("CURSO A");
        Curso c2 = new Curso("CURSO B");
        Curso c3 = new Curso("CURSO C");
        Curso c4 = new Curso("CURSO D");
        Curso c5 = new Curso("CURSO E");

        Disciplina d1 = new Disciplina("DISCIPLINA A");
        Disciplina d2 = new Disciplina("DISCIPLINA B");
        Disciplina d3 = new Disciplina("DISCIPLINA C");
        Disciplina d4 = new Disciplina("DISCIPLINA D");
        Disciplina d5 = new Disciplina("DISCIPLINA E");

        c1.setDisciplinas(Arrays.asList(d1, d2, d3, d4, d5));
        c2.setDisciplinas(Arrays.asList(d1, d4));
        c3.setDisciplinas(Arrays.asList(d3, d4, d5));
        c4.setDisciplinas(Arrays.asList(d4));
        c5.setDisciplinas(Arrays.asList(d2, d1, d5));

        d1.setCursos(Arrays.asList(c1, c2, c3, c4, c5));
        d2.setCursos(Arrays.asList(c1, c3));
        d3.setCursos(Arrays.asList(c1, c4));
        d4.setCursos(Arrays.asList(c4, c5, c2));
        d5.setCursos(Arrays.asList(c3));

        d1.setTopico(Arrays.asList(t1, t2, t3, t4, t5));
        d2.setTopico(Arrays.asList(t1, t3));
        d3.setTopico(Arrays.asList(t3, t4, t5));
        d4.setTopico(Arrays.asList(t2, t3));
        d5.setTopico(Arrays.asList(t1, t2));
        
        System.out.println(c1.toString());
    }
}
