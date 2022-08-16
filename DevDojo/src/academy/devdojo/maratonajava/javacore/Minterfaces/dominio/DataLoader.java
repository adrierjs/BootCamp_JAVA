package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader{
    void carregar();

    default void checarPermicao(){
        System.out.println("Fazendo a verificação da permissão no DataLoader...");
    }

}
