package introducao.sintaxe.tiposDeVariaveis;

public class Televisao {

    private String nome;
    private boolean status;
    private int volume = 0;

    public Televisao(String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void ligarTV(){
        if (this.status == false){
            this.status = true;
        }
    }

    public void desligarTV(){
        if (this.status == true){
            this.status = false;
        }
    }

    public void aumentarVol(){
        if(this.volume<10 && this.volume >=0){
            this.volume +=1;
        }
    }

    public void diminuirVol(){
        if(this.volume>0){
            this.volume -=1;
        }
    }

    public int volume(){
        return this.volume;
    }

}
