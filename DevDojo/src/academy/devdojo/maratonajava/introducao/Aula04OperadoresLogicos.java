package academy.devdojo.maratonajava.introducao;

public class Aula04OperadoresLogicos {
    public static void main(String[] args) {
        /*and(&&) or(||) */
        int idade = 10;
        String palavra = "azul";
        if (idade<=10 && idade >=0){
            System.out.println("É menor ou igual a 10 e maior ou igual a zero");

        } if (palavra == "Azul" || palavra =="azul"){
            System.out.println("Palavra correta!");
        }

    }
}
