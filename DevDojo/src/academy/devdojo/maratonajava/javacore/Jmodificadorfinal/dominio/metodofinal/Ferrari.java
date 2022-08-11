package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.metodofinal;

public class Ferrari extends Carro{ //Não é permitido que seja extendido caso esteja como final
    private double valor;

    public Ferrari(){

    }

    public Ferrari(String nome, double valor){
        super(nome);
        this.valor = valor;
    }

    public Ferrari(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

//    o método imprime não permite a sobrescrita
//    public void imprime(){


}
