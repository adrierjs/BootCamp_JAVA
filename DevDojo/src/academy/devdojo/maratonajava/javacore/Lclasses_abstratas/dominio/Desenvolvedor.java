package academy.devdojo.maratonajava.javacore.Lclasses_abstratas.dominio;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor() {
    }

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
       double salario = getSalario();
       salario += getSalario()*0.05;
       setSalario(salario);
    }

    public String toString(){
        return "Desenvolvedor:\n " + "Nome:"+super.getNome() + "Salário: " + super.getSalario();
    }
}
