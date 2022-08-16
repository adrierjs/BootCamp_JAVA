package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

import javax.xml.crypto.Data;

public class DataBase implements DataLoader, DataRemove {
    @Override
    public void carregar() {
        System.out.println("Carregando dados do banco de dados...");
    }

    @Override
    public void remover() {
        System.out.println("Removendo dados do banco de dados...");
    }

    @Override
    public void checarPermicao() {
        System.out.println("Checando permissões no DataBase");
    }
}
