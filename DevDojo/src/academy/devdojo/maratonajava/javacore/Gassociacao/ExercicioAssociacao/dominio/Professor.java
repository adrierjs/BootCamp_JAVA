package academy.devdojo.maratonajava.javacore.Gassociacao.ExercicioAssociacao.dominio;

import java.util.Arrays;

public class Professor {
    private String nome, especialidade;
    private Seminario[] seminarios;

    public Professor() {
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios){
        this.nome = nome;
        this.seminarios = seminarios;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println("----Professores----");
        System.out.println("Nome:"+this.nome);
        System.out.println("Especialidade: "+this.especialidade);
        if(seminarios != null){
            System.out.print("Seminários: ");
            for (Seminario seminario : seminarios) {
                System.out.print(seminario.getTitulo() + ", ");
            }
        }else{
            System.out.println("Não existem seminários cadastrados");
        }
    }
}
