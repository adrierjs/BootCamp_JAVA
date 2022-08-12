package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(carro.getVELOCIDADE_LIMITE());
        System.out.println(carro.getComprador());
        carro.getComprador().setNome("Adrier");
        carro.getComprador().setValor(40.000);
        System.out.println("Comprador: "+carro.getComprador().getNome()+"\n"+
                "Valor:" +carro.getComprador().getValor());

    }
}
