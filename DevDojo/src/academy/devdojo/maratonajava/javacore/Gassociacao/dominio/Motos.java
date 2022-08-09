package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Motos{
    private String nome, marca;

    public Motos() {
    }

    public Motos(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
