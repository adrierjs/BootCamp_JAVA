package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Marca;

public class ComputadorTest02 {
    public static void main(String[] args) {
        Computador c1 = new Computador("Mac air");
        Marca m1 = new Marca("Apple");

        c1.setMarca(m1);
        c1.imprime();

    }
}
