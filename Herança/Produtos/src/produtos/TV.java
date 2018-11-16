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
public class TV extends Produto {
    private String canal;
    
    public TV(int serial, float preco, String canal) {
        super(serial, preco);
        this.canal = canal;
    }
    
    @Override
    public String mexer(String canal){
        this.canal = canal;
        return "A TV agora está no canal: " + canal;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    @Override
    public String toString() {
        return super.toString() + " TV{" + "canal=" + canal + '}';
    }    
}
