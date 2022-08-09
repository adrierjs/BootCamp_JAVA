package academy.devdojo.maratonajava.javacore.Gassociacao.test;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;

public class AlunoTest03 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Adrier");
        Escola e1 = new Escola("UEPB");
        aluno.setEscola(e1);
        Aluno[] alunos = {aluno};
        e1.setAluno(alunos);

        System.out.println("-----Alunos-----");
        aluno.imprimir();
        System.out.println("-----Escola------");
        e1.imprime();
    }
}
