package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // 1,2,3,4,5,6,7,8,9,10,11,12 Meses
        //31,28,31,30
        int[][] dias = new int[3][3];

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 1;
        dias[1][1] = 2;
        dias[1][2] = 3;

//        for(int i=0; i<dias.length;i++){
//            for(int j=0; j<dias.length;j++){
//                System.out.println(dias[i][j]);
//            }
//        }

        for(int[] meses: dias){
            for(int num: meses){
                System.out.println(num);

            }

        }
    }
}
