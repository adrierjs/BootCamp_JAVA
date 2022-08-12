package academy.devdojo.maratonajava.javacore.Kenumeracao.dominio;

public enum TipoCliente {

    //Forcei que nessa enumeração pudesse passar apenas esse tipo de variável
    PESSOA_FISICA(1, "Pessoa fisica"),
    PESSOA_JURIDICA(2, "Pessoa juridica"),
    PESSOA_PUBLICA(3, "Pessoa publica");

    private int valor;
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public int getVALOR() {
        return valor;
    }

    public String getNomeRelatorio(){
        return nomeRelatorio;
    }
}
