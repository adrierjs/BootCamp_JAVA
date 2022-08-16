package academy.devdojo.maratonajava.javacore.Lclasses_abstratas.test;

import academy.devdojo.maratonajava.javacore.Lclasses_abstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclasses_abstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclasses_abstratas.dominio.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("João",12000);
        Desenvolvedor dev = new Desenvolvedor("Adrier",5000);

        System.out.println(g1);
        System.out.println(dev);
        g1.imprime();
        dev.imprime();
    }
}
