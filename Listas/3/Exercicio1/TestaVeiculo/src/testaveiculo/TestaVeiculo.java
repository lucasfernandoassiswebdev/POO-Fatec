/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaveiculo;

import veiculojar.Veiculo;

/**
 *
 * @author 1090481711022
 */
public class TestaVeiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciação de carro e moto
        Veiculo carro = new Veiculo("Carro", 4, "Prata", 2018, "Lucas");
        Veiculo moto = new Veiculo("Moto", 2, "Preto", 2013, "Gabriel");
        System.out.println("--------------------------------------------------");
        System.out.println("Dados de carro:");
        carro.mostra();

        System.out.println("--------------------------------------------------");
        System.out.println("Dados de moto:");
        moto.mostra();

        System.out.println("--------------------------------------------------");
        System.out.println("Dados de moto alterados:");
        moto.alteraTipo("Triciclo");
        moto.setNroRodas(3);
        moto.setCor("Azul");
        moto.setAno(2015);
        Veiculo.setNomeDono("Bruno");
        moto.mostra();

        System.out.println("--------------------------------------------------");
        System.out.println("Dados de carro após alteração dos dados da moto:");
        carro.mostra();

        System.out.println("--------------------------------------------------");
        System.out.println("Método \"nroRodas()\":");
        System.out.println("Carro: " + moto.nroRodas(moto.getNroRodas()));
        System.out.println("Moto: " + carro.nroRodas(carro.getNroRodas()));

        System.out.println("--------------------------------------------------");
        System.out.println("Novo veículo:");
        Veiculo novo_veiculo = new Veiculo();
        novo_veiculo = novo_veiculo.retornaNovoVeiculo(moto, carro);
        novo_veiculo.mostra();
    }

}
