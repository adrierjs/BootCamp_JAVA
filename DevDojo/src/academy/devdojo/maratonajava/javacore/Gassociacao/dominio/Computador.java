package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Computador {
    private String nome;
    private Marca marca;

    public Computador(){}

    public Computador(String nome){this.nome = nome;}

    public void imprime(){
        System.out.println("Modelo: "+ this.getNome());
        if(marca != null){
            System.out.println("Marca: "+marca.getMarca());
        }

    }

    public void setNome(String nome){this.nome = nome;}

    public String getNome(){return this.nome;}

    public void setMarca(Marca marca){this.marca = marca;}

    public Marca getMarca() {
        return marca;
    }
}
