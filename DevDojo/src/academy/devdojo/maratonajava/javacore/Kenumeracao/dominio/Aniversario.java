package academy.devdojo.maratonajava.javacore.Kenumeracao.dominio;

public class Aniversario {
    private String nome;
    private TipoMes tipoMes;

    public Aniversario(String nome, TipoMes tipoMes){
        this.nome = nome;
        this.tipoMes = tipoMes;
    }

    public String toString(){
        return "Nome: " + nome + "\nMês: " + tipoMes.getMes();
    }

}
