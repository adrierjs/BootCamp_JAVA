package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.metodofinal;

public /*final*/ class Carro {
    private String nome;

    public Carro(){

    }
    public Carro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public final void imprime(){
        System.out.println("Nome: "+ this.nome);
    }
}
