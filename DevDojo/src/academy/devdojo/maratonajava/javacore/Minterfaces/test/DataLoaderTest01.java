package academy.devdojo.maratonajava.javacore.Minterfaces.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DataBase;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DataLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        FileLoader fileLoader = new FileLoader();
        dataBase.carregar();
        dataBase.remover();
        dataBase.checarPermicao();
        fileLoader.carregar();
        fileLoader.remover();
        fileLoader.checarPermicao();



    }
}
