package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Concessionaria {
    private String nome;
    private Motos[] motos;
    private Carros[] carros;

    public Concessionaria() {
    }

    public Concessionaria(String nome) {
        this.nome = nome;
    }

    public Concessionaria(String nome, Carros[] carros, Motos[] motos){
        this.nome = nome;
        this.carros = carros;
        this.motos = motos;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void imprime(){
        System.out.println("Concessionária: "+this.nome);
        if(carros != null){
            System.out.println("\n***Carros***");
            for(Carros carros1 : carros){
                System.out.println("Nome: "+ carros1.getNome()+
                        "\nMarca: "+carros1.getMarca());
            }
        }
        if (motos != null){
            System.out.println("\n***Motos***");
            for(Motos motos1 : motos){
                System.out.println("Nome:" + motos1.getNome()+
                        "\nMarca: "+ motos1.getMarca());
            }
        }

    }
}
