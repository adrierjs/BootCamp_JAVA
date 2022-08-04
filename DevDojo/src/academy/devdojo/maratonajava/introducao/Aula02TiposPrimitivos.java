package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args){
        //int, double, float, char, byte, short, long, boolean
        int idadePai = 50;
        long numGrande = 1000000000;
        double salarioDouble = 2000; //precisão de 10 casas
        float salarioFloat = 2400;//precisão de 6 casas
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean condicao = true;

        int cating = (int)numGrande;

        System.out.println(cating);


    }

}
