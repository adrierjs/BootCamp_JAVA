package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(carro.getVELOCIDADE_LIMITE());
        System.out.println(carro.getComprador());
        carro.COMPRADOR.setNome("Adrier");
        carro.COMPRADOR.setValor(40.000);
        System.out.println(carro.COMPRADOR.getNome()+"\n"+
                carro.COMPRADOR.getValor());
    }
}
