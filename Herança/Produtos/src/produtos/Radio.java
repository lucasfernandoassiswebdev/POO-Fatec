/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtos;

/**
 *
 * @author LUCASFERNANDODEASSIS
 */
public class Radio extends Produto {

    private String banda;
    private float estacao;

    public Radio(int serial, float preco, String banda, float estacao) {
        super(serial, preco);

        this.banda = banda;
        this.estacao = estacao;
    }

    @Override
    public String mexer(String banda) {
        this.banda = banda;
        return "O rádio agora está na banda: " + banda;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public float getEstacao() {
        return estacao;
    }

    public void setEstacao(float estacao) {
        this.estacao = estacao;
    }

    @Override
    public String toString() {
        return super.toString() + " Radio{" + "banda=" + banda + ", estacao=" + estacao + '}';
    }
}
