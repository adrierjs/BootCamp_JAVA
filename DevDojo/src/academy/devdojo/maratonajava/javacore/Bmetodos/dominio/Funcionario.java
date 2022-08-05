package academy.devdojo.maratonajava.javacore.Bmetodos.dominio;

/** Crie uma classe Funcionário com os seguintes atributos:
 * nome, idade e salário (três salários devem ser guardados)
 *
 * Crie dois métodos
 *
 * 1 - Para imprimir os dados
 * 2 - Para tirar a média dos salários
 */
public class Funcionario {
    private String nome;
    private int idade;
    private double salarios[];

    public Funcionario() {
    }

    public Funcionario(String nome, int idade, double[] salarios) {
        this.nome = nome;
        this.idade = idade;
        this.salarios = salarios;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return this.salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    private void imprimeSalarios(){
        System.out.print("Salários: ");
        for(int i = 0; i<salarios.length; i++) {
            System.out.print(salarios[i]+", ");
        }
        System.out.println();
    }

    public void imprimirDados() {
        System.out.println("Nome:" + this.nome+
                "\nIdade: " + this.idade);
        imprimeSalarios();
    }

    public void calcularMedia(double[] salarios2){
        double soma = 0;
        for(double salario : salarios2){
            soma+= salario;
        }
        System.out.println("Média: "+soma/salarios2.length);
    }

}
