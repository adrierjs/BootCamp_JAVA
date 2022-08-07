package academy.devdojo.maratonajava.javacore.Fmodificadorstatic.test;


import academy.devdojo.maratonajava.javacore.Fmodificadorstatic.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro("Audi",280);
        Carro c2= new Carro("BMW",290);
        Carro c3 = new Carro("Volvo",260);
        Carro.setVelocidadeLimite(200); //utilização do método estático
        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
