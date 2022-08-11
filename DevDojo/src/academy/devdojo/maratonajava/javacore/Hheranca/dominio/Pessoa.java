package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {
    private String nome, cpf;
    private Endereco endereco;

    static{
        System.out.println("Dentro do bloco de inicialização estático pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização pessoa 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização pessoa 2");
    }

    public Pessoa() {
    }

    public Pessoa(String nome){
        this.nome = nome;
        System.out.println("Dentro do construtor de Pessoa");
    }

    public Pessoa(String nome, String cpf, Endereco endereco) {
        this(nome); //chamei o construtor que tinha só o nome. Obs.: só pode ser chamado na primeira linha
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getcCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void imprime(){
        System.out.println("Nome:"+ this.nome+
                "\nCPF: "+this.cpf+
                "\nCidade: "+endereco.getCidade()+
                "\nRua: "+endereco.getRua());
    }
}
