package introducao.condicionais;

public class Teste {
    public static void main(String[] args) {
        int variavel = 1;
//        if (variavel == 0){
//            System.out.println("Bom dia!");
//        } else if (variavel ==1){
//            System.out.println("Boa tarde");
//        } else{
//            System.out.println("Boa noite");
//        }

        String resultado = variavel >=1 ?"é um" : "Não é um";
        System.out.println(resultado);
    }
}
