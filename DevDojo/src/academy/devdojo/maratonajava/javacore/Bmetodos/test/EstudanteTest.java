package academy.devdojo.maratonajava.javacore.Bmetodos.test;

import academy.devdojo.maratonajava.javacore.Bmetodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bmetodos.dominio.Imprimir;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante aluno1 = new Estudante("Adrier","2000","Rua ericina",20,9999);
        Estudante aluno2 = new Estudante("Adjunio","2020021","Parelhas",34,9999);

        Imprimir imprimir = new Imprimir();
        imprimir.imprimeEstudantes(aluno1);

        imprimir.imprimeEstudantes(aluno2);
    }
}
