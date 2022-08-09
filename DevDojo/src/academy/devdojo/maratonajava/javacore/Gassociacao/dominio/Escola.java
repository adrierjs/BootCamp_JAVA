package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Escola {
    private String nome;
    private Aluno[] aluno;

    public Escola() {
    }


    public Escola(String nome, Aluno[] aluno) {
        this.nome = nome;
        this.aluno = aluno;
    }

    public Escola(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }

    public void imprime() {
        System.out.println("Escola: " + this.nome);
        if (aluno != null) {
            for (Aluno profs : aluno) {
                System.out.println(profs.getNome());
            }

        }
    }

}
