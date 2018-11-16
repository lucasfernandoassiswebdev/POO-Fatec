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
public class Produto {
    protected int serial;
    protected float preco;

    public Produto(int serial, float preco) {
        this.serial = serial;
        this.preco = preco;
    }        
    
    public String mexer(String param){
        return "";
    }
    
    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" + "serial=" + serial + ", preco=" + preco + '}';
    }        
}
