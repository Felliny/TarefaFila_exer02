package Model;

public class Processo {
    private String nome;
    private int tempo;


    public Processo(String nome, int tempo){
        this.nome= nome;
        this.tempo= tempo;
    }


    public String getNome(){
        return nome;
    }

    public int getTempo(){
        return tempo;
    }

    public void decrementarTempo(){
        tempo--;
    }
}
