public class FakeNews implements Movimento{
    
    //Atributos
    private String nome;
    private Posicao posicao;
    private int tipo;

    //Construtor
    public FakeNews(Posicao posicao, int tipo, String nome){
        this.setNome(nome);
        this.setPosicao(posicao);
        this.setTipo(tipo);
    }

    //Métodos get/set
    public Posicao getPosicao(){
        return this.posicao;
    }

    public int getTipo(){
        return this.tipo;
    }

    public String getNome(){
        return this.nome;
    }

    public void setPosicao(Posicao posicao){
        this.posicao = posicao;
    }

    public void setTipo(int tipo){
        this.tipo = tipo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    //Outros métodos
    public void movimentar(){

    }
}
