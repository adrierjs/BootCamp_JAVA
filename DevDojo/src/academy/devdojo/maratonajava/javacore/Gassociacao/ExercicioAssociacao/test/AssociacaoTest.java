package academy.devdojo.maratonajava.javacore.Gassociacao.ExercicioAssociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.ExercicioAssociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.ExercicioAssociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.ExercicioAssociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.ExercicioAssociacao.dominio.Seminario;



public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Patos-PB");
        Aluno a1 = new Aluno("Adrier", 20);
        Aluno a2 = new Aluno("José",19);
        Aluno a3 = new Aluno("Sara", 20);
        Aluno[] alunosFisica = {a1,a2};
        Aluno[] alunosMat = {a3};
        Seminario matematica = new Seminario("Matemática", local,alunosMat);
        Seminario fisica = new Seminario("Física", local,alunosFisica);
        Seminario[] seminarios = {fisica, matematica};
        Professor professor = new Professor("Paulo","Ciências exatas",seminarios);

        professor.imprime();
        matematica.imprime();
        fisica.imprime();








    }
}
