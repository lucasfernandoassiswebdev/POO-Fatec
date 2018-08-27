/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio_1;

/**
 *
 * @author 1090481711022
 */
public class TestaAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1, "Lucas", 19, 8, 7);
        System.out.println("Nota do aluno: " + aluno.notaFinal());
        System.out.println(aluno.dadosAluno());
        System.out.println(aluno.passou() ? "Aluno foi aprovado" : "Aluno foi reprovado");
    }
}
