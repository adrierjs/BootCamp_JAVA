package academy.devdojo.maratonajava.javacore.Kenumeracao.dominio;

public class Cliente {
    private String nome;
    private TipoCliente tipoCliente; //criei a enumeração para forçar ao usuário a colocar somente os atributos necessários na enumeração.

    public Cliente(String nome, TipoCliente tipoCliente){
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getNomeRelatorio() +
                ", tipoClienteInt=" + tipoCliente.getVALOR()+
                '}';
    }
}