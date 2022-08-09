package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;

public class AlunoTest {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Adrier");
        Aluno a2 = new Aluno("Élder");
        Aluno a3 = new Aluno("Jennyfer");
        Aluno[] alunos = {a1,a2,a3};
        Escola uepb = new Escola("UEPB",alunos);
        uepb.imprime();


    }
}
