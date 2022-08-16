package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemove {
    @Override
    public void carregar() {
        System.out.println("Carregando dos do arquivo...");

    }

    @Override
    public void remover() {
        System.out.println("Removendo arquivo...");
    }

    @Override
    public void checarPermicao() {
        System.out.println("Checando permissões no FileLoader");
    }
}


