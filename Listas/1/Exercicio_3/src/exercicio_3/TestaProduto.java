/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_3;

/**
 *
 * @author 1090481711022
 */
public class TestaProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setId(1);
        produto.setDescricao("Teste 1");
        produto.setPreco(10);
        produto.setQtde(15);
        System.out.println(produto.mostra());
        
        produto = new Produto(2, "Teste 2", 5, 6);
        System.out.println(produto.mostra());
    }
}
