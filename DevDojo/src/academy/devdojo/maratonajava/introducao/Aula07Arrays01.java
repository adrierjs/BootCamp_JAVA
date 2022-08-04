package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        int tamanho = 3;
        int idades[] = new int[tamanho];
        idades[0] = 20;
        idades[1] = 22;
        idades[2] = 14;

        for(int i=0; i<idades.length;i++){
            System.out.println(idades[i]);
        }
    }
}
