package testeAluno;

import alunojar.Aluno;

/**
 *
 * @author 1090481711022
 */
public class TesteAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno = new Aluno("12345", "Lucas", 19, 10, 8);
        System.out.println(aluno.toString());
        aluno.passou();
        System.out.println("------------------------------------------------");
        aluno.setP1(5);
        aluno.setP2(4);
        aluno.passou();
    }
}
