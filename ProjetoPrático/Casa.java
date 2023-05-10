public class Casa {

    //Atributos
    private Jogador J;
    private Restrito R;
    private Fake F;
    
    //Me explica pq n utilizar o método set em tudo 
    //Pq n concatenar as duas funções abaixo com um boolean
    public void jogadorEntra(Jogador J){
        this.J = J;
    }

    public void jogadorSai(){
        this.J = null;
    }

    public void restritoEntra(Restrito R){
        this.R = R;
    }

    public void fakeEntra(Fake F){
        this.F = F;
    }
}
