package academy.devdojo.maratonajava.javacore.Bmetodos.dominio;

public class Imprimir {
    public void imprimeEstudantes(Estudante estudante){
        System.out.println("\nNome: "+estudante.getNome()+
                "\nEndereço: "+estudante.getEndereco()+
                "\nTelefone: "+estudante.getTelefone()+
                "\nIdade: "+estudante.getIdade()+
                "\nMatricula: "+estudante.getMatricula());
    }
}
