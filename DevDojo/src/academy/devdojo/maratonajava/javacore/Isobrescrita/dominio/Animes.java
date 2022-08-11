package academy.devdojo.maratonajava.javacore.Isobrescrita.dominio;

public class Animes {
    private String nome;

    public Animes(){

    }

    public Animes(String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    @Override
    public String toString(){
        return "Anime: " + this.nome;
    }

}
