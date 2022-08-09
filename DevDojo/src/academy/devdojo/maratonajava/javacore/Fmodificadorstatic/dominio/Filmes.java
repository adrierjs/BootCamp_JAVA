package academy.devdojo.maratonajava.javacore.Fmodificadorstatic.dominio;

public class Filmes {
    private String nome, duracao;
    private static int[] episodios;

    static { //Garantido que ele irá ser executado só uma vez, pois será alocado na JVM
        episodios = new int[100];
        System.out.println("\nDentro do bloco de inicialização");
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
            System.out.print(episodios[i]+" ");
        }
    }

    static {
        System.out.println("\nDentro do bloco de inicialização 2");
    }

    static {
        System.out.println("Dentro do bloco de inicialização 3");
    }

    public Filmes() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
