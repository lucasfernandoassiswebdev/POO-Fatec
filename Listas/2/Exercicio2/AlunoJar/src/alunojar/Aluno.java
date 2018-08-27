package alunojar;

/**
 *
 * @author 1090481711022
 */
public class Aluno {

    private String numeroAluno;
    private String nome;
    private int idade;
    private float p1;
    private float p2;

    public Aluno() {
    }

    public Aluno(String numeroAluno, String nome, int idade, float p1, float p2) {
        trataNumeroAluno(numeroAluno);
        trataNomeAluno(nome);
        this.idade = idade;
        trataP1(p1);
        trataP2(p2);
    }

    public float notaFinal() {
        System.out.println("Média do aluno: " + (p1 + p2) / 2);
        return (p1 + p2) / 2;
    }

    public void passou() {
        System.out.println(notaFinal() > 6 ? "Aluno aprovado" : "Aluno reprovado");
    }

    @Override
    public String toString() {
        return "\nDados do Aluno: " + "\nNúmero do Aluno: " + numeroAluno + "\nNome: " + nome + "\nIdade: " + idade + "\np1: " + p1 + "\np2: " + p2;
    }

    public String getNumeroAluno() {
        return numeroAluno;
    }

    public void setNumeroAluno(String numeroAluno) {
        this.numeroAluno = numeroAluno;
    }

    private void trataNumeroAluno(String numeroAluno) {
        if (numeroAluno.length() > 6) {
            System.out.println("O número do aluno não deve ultrapassar 6 caracteres");
        } else {
            this.numeroAluno = numeroAluno;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        trataNomeAluno(nome);
    }

    private void trataNomeAluno(String nome) {
        if (nome.length() > 30) {
            System.out.println("O nome do Aluno não deve ultrapassar 30 caracteres");
        } else {
            this.nome = nome;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        trataP1(p1);
    }

    private void trataP1(float p1) {
        if (p1 < 0) {
            System.out.println("A nota 1 deve ser positiva");
        } else {
            this.p1 = p1;
        }
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        trataP2(p2);
    }

    private void trataP2(float p2) {
        if (p2 < 0) {
            System.out.println("A nota 2 deve ser positiva");
        } else {
            this.p2 = p2;
        }
    }
}
