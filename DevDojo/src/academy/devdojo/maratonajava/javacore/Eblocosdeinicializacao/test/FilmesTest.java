package academy.devdojo.maratonajava.javacore.Eblocosdeinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosdeinicializacao.dominio.Filmes;

public class FilmesTest {
    public static void main(String[] args) {
        Filmes f1 = new Filmes();
        for (int i = 0; i < f1.getEpisodios().length; i++) {
            System.out.print(f1.getEpisodios()[i]+" ");
        }

    }
}
