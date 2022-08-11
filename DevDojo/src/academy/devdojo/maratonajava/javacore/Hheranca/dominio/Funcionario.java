package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    static{
        System.out.println("Dentro do bloco de inicialização estático funcionário");
    }
    {
        System.out.println("Dentro do bloco de inicialização funcionário 1");
    }
    {
       System.out.println("Dentro do bloco de inicialização funcionário 2   ");
    }


    public Funcionario(double salario){
    this.salario = salario;
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor da classe Funcionario");
    }

    public Funcionario(String nome, String cpf, Endereco endereco, double salario){
        super(nome,cpf,endereco);
        this.salario = salario;
        System.out.println("Dentro do construtor de salário");
    }

    public void imprime(){
        super.imprime();
        System.out.println("Salário: "+this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu "+super.getNome()+ "recebi " + this.salario);
    }
}
