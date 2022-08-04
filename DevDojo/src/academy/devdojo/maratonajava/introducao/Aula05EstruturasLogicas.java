package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasLogicas {
    public static void main(String[] args) {
        boolean verificacao = true;

        if (verificacao){
            System.out.println("Verdadeiro!");
        } else{
            System.out.println("Falso!");;
        }
        /*Operadora ternário
        String varivel = (condicao) verdadeiro ? : falso;
        */
        int retorno = (verificacao) ? 1: 0;
        System.out.println(retorno);



    }
}
