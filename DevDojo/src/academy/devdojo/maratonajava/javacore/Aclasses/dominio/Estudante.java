package academy.devdojo.maratonajava.javacore.Aclasses.dominio;

public class Estudante {
    private String nome, matricula, endereco;
    private int idade, telefone;

    public Estudante(String nome, String matricula, String endereco, int idade, int telefone){
        this.nome = nome;
        this.matricula = matricula;
        this.endereco = endereco;
        this.idade = idade;
        this.telefone = telefone;
    }

    public Estudante(){

    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", endereco='" + endereco + '\'' +
                ", idade=" + idade +
                ", telefone=" + telefone +
                '}';
    }
}
