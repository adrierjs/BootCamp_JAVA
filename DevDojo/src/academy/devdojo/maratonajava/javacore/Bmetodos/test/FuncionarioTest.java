package academy.devdojo.maratonajava.javacore.Bmetodos.test;

import academy.devdojo.maratonajava.javacore.Bmetodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        double[] salarios = {1200,1200,1200};
        Funcionario func1 = new Funcionario("Adrier", 20,salarios);
        func1.imprimirDados();
        func1.calcularMedia(salarios);



    }
}
