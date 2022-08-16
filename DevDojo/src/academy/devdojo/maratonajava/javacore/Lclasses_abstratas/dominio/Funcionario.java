package academy.devdojo.maratonajava.javacore.Lclasses_abstratas.dominio;

public abstract class Funcionario extends Pessoa{
    private String nome;
    private double salario;

    public Funcionario(){}

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    @Override
    public void imprime() {
        System.out.println("imprimindo...");
    }

    public abstract void calculaBonus();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
