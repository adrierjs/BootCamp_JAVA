package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Computador;

public class ComputadorTest {
    public static void main(String[] args){
        Computador c1 = new Computador("Inspirion");
        Computador c2 = new Computador("Mac");
        Computador c3 = new Computador("Aspire");
        Computador[] computadores = {c1,c2,c3};
        for(int i = 0; i<computadores.length; i++) {
        System.out.println("Modelo: "+computadores[i].getNome());
        }
//        Ou
        System.out.println("-----------");


        for (Computador computador : computadores) {
            computador.imprime();

        }


    }
}
