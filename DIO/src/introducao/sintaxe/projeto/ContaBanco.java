package introducao.sintaxe.projeto;

public class ContaBanco {
    private int numero;
    private String nome, agencia;
    private double saldo;

    public ContaBanco(int numero, String nome, String agencia, double saldo){
        this.numero = numero;
        this.nome = nome;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public ContaBanco(){

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaBanco{" +
                "numero=" + numero +
                ", nome='" + nome + '\'' +
                ", agencia='" + agencia + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
