package academy.devdojo.maratonajava.javacore.CsobrecargadeMetodos.dominio;

public class Filmes {
    private String nome, tipo, duracao, emissora;

    public Filmes(){

    }

    public void cadastrarFilmes(String nome, String tipo, String duracao) {
        this.nome = nome;
        this.tipo = tipo;
        this.duracao = duracao;
    }

    public void cadastrarFilmes(String nome, String tipo, String duracao, String emissora){
        this.cadastrarFilmes(nome, tipo, duracao);
        this.emissora = emissora;
    }





    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
}
