package academy.devdojo.maratonajava.javacore.Bmetodos.test;

import academy.devdojo.maratonajava.javacore.Bmetodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String... args) {
        Calculadora c1 = new Calculadora();
        int array[] = {1,2,3,4,6};

        c1.somaArrays(array);
        //A vantagem de usar o Array VarArgs é que pode-se passar já o conteúdo do array direto no parâmetro
        //Desvantagem: o array deve ser o último atributo do parâmetro

        c1.somaVarargs("c1",1,2,3,4,5,6);
    }
}
