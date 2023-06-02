public class FakeNews implements Movimento{
    
    //Atributos
    private Posicao posicao;

    //Construtor
    public FakeNews(Posicao posicao){
        this.setPosicao(posicao);
    }

    //Métodos get/set
    public Posicao getPosicao(){
        return posicao;
    }

    public void setPosicao(Posicao posicao){
        this.posicao = posicao;
    }

    //Outros métodos
    public void movimentar(){

    }
}
