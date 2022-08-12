package academy.devdojo.maratonajava.javacore.Kenumeracao.test;

import academy.devdojo.maratonajava.javacore.Kenumeracao.dominio.Aniversario;
import academy.devdojo.maratonajava.javacore.Kenumeracao.dominio.TipoMes;

public class AniversarioTest {
    public static void main(String[] args) {
        Aniversario a1 = new Aniversario("Adrier", TipoMes.MARCO);
        System.out.println(a1);

    }
}
