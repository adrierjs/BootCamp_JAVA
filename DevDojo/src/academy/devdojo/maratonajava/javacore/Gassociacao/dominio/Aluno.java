package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Aluno {
    private String nome;
    private Escola escola;

    public Aluno() {
    }
    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, Escola escola){
        this.nome = nome;
        this.escola = escola;
    }

    public String getNome() {
        return nome;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimir(){
        System.out.println("Aluno\nNome: " + this.nome);
        if (escola != null){
            System.out.println(escola.getNome());
        }
    }
}
