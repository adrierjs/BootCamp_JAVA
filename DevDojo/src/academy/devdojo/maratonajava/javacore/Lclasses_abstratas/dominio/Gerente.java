package academy.devdojo.maratonajava.javacore.Lclasses_abstratas.dominio;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        double salario = getSalario();
        salario += getSalario()*0.1;
        setSalario(salario);
    }

    @Override
    public String toString() {
        return "Gerente:\n" + "Nome: " +super.getNome() + "\nSalário: "+super.getSalario();
    }
}
