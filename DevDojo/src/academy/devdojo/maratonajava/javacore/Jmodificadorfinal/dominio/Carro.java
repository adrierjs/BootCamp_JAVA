package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;

public class Carro {

    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();
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

    public double getVELOCIDADE_LIMITE() {
        return VELOCIDADE_LIMITE;
    }

    public Comprador getComprador() {
        return COMPRADOR;
    }
}
