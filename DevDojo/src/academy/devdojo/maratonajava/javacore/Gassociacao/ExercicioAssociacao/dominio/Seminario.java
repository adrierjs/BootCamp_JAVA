package academy.devdojo.maratonajava.javacore.Gassociacao.ExercicioAssociacao.dominio;

public class Seminario {
    private String titulo;
    private Local local;

    private Aluno[] alunos;


    public Seminario() {
    }

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Local local, Aluno[] alunos) {
        this.titulo = titulo;
        this.local = local;
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos(){
        return this.alunos;
    }

    public void setAlunos(Aluno[] alunos){
        this.alunos = alunos;
    }


    public void imprime(){
        System.out.println("\n----Seminários----");
        System.out.println("Título: "+this.titulo);
        if (local != null){
            System.out.println("Local: "+ local.getEndereco());
        }else{
            System.out.println("Local: Não encontrado!");
        }
        if(alunos != null){
            System.out.print("Alunos: ");
            for (Aluno aluno : alunos) {
                System.out.print(aluno.getNome()+ ", ");
            }
        }else{
            System.out.println("Alunos: Não foram encontrados alunos!");
        }
    }
}
