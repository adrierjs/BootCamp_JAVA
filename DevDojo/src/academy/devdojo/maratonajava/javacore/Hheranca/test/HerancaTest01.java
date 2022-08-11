package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco e1 = new Endereco("Rua ericina", "Jardim do Serído");
        Pessoa p1 = new Pessoa("Adrier","00000-12", e1);
        Funcionario f1 = new Funcionario("Adrier","00000",e1,1200);
        f1.imprime();
        f1.relatorioPagamento();


    }




}
