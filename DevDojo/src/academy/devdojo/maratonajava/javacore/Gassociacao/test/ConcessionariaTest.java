package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Carros;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Concessionaria;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Motos;

public class ConcessionariaTest {
    public static void main(String[] args) {
        Motos m1 = new Motos("CB-300","Honda");
        Motos m2 = new Motos("CB-1000","Honda");
        Carros c1 = new Carros("A3", "Audi");
        Carros c2 = new Carros("Q4", "Audi");
        Motos[] motos = {m1,m2};
        Carros[] carros = {c1,c2};
        Concessionaria concessionaria = new Concessionaria("Motos e Carros",carros, motos);

        concessionaria.imprime();

    }
}
