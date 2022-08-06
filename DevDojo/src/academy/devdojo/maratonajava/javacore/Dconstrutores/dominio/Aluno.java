package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Aluno {
    String nome, endereco, matricula, telefone;
    int idade;

    public Aluno(){

    }

    public Aluno(String nome, String endereco, String matricula, int idade){
        this.nome = nome;
        this.endereco = endereco;
        this.matricula = matricula;
        this.idade = idade;
    }

    public Aluno(String nome, String endereco, String matricula, int idade, String telefone){
        this(nome, endereco, matricula, idade); //referencia ao construtor com os arguementos
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", matricula='" + matricula + '\'' +
                ", telefone='" + telefone + '\'' +
                ", idade=" + idade +
                '}';
    }
}
