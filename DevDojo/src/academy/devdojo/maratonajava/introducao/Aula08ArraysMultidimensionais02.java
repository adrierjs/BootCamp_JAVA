package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        int[] array2 = {10,11,12,13};

        //Criando um array para cada posição do arrayInt
        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1,2,3,4,5};

        //outra forma de se fazer
        arrayInt[2] = array2;

        //outra forma de iniciar um array multidimencional
        int[][] intArray2 = {{0,1,2},{3,4,5},{6,7,8}};

        for(int[] arrayBase :arrayInt){
            System.out.println("---");
            for(int num :arrayBase){
                System.out.print(num + " ");
            }
        }
        }


}
