package academy.devdojo.maratonajava.javacore.Bmetodos.dominio;

public class Calculadora {
    private double num1, num2;

    public Calculadora() {
    }


    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double somarNumeros(double num1, double num2) {
        return this.num1 + this.num2;
    }

    public void somaArrays(int[] numeros){
        int soma = 0;
        for (int num : numeros) {
            soma +=num;

        }
        System.out.println(soma);
    }

    public void somaVarargs(String nome,int... numeros){
        int soma=0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println("Calculadora: "+nome + "\n" + soma);
    }


}
