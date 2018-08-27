/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculojar;

/**
 *
 * @author 1090481711022
 */
public class Veiculo {

    private String tipo;
    private int nroRodas;
    private String cor;
    private int ano;
    private static String nomeDono;

    public Veiculo() {
    }

    public Veiculo(String tipo, int nroRodas, String cor, int ano, String nomeDono) {
        alteraTipo(tipo);
        alteraNome(nomeDono);
        this.nroRodas = nroRodas;
        this.cor = cor;
        this.ano = ano;
    }

    public void alteraTipo(String tipo) {
        this.tipo = tipo;
    }

    public static void alteraNome(String nome) {
        Veiculo.nomeDono = nome;
    }

    private static String retornaNome() {
        return Veiculo.nomeDono;
    }

    public String nroRodas(int nroRodas) {
        return nroRodas % 2 == 0 ? "Número de rodas par" : "Número de rodas ímpar";
    }

    public Veiculo retornaNovoVeiculo(Veiculo veiculo1, Veiculo veiculo2) {
        int soma_rodas = veiculo1.getNroRodas() + veiculo2.getNroRodas();
        int ano = veiculo1.getAno() > veiculo2.getAno() ? veiculo1.getAno() : veiculo2.getAno();
        
        return new Veiculo(veiculo1.tipo, soma_rodas, veiculo2.getCor(), ano, Veiculo.getNomeDono());
    }

    public void mostra() {
        System.out.println("Nome do dono dos veículos: " + Veiculo.nomeDono + "\nTipo do veículo: " + this.tipo + "\nNúmero de rodas: " + this.nroRodas
                + "\nCor do veículo: " + this.cor + "\nAno do veículo: " + this.ano + "\n" + nroRodas(this.nroRodas));
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        alteraTipo(tipo);
    }

    public int getNroRodas() {
        return nroRodas;
    }

    public void setNroRodas(int nroRodas) {
        this.nroRodas = nroRodas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public static String getNomeDono() {
        return retornaNome();
    }

    public static void setNomeDono(String nomeDono) {
        alteraNome(nomeDono);
    }
}
