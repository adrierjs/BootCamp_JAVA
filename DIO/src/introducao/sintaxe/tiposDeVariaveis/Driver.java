package introducao.sintaxe.tiposDeVariaveis;

public class Driver {
    public static void main(String[] args){
        Televisao t1 = new Televisao("Samsung");
        t1.ligarTV();
        System.out.println(t1.getStatus());
        t1.diminuirVol();
        System.out.println(t1.volume());


    }

}
