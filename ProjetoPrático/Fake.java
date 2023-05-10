public class Fake extends Peca {
   
    //Atributos
    private String nome;

    //Construtor
    public Fake (int linha, int coluna){
        super(linha, coluna);
        this.setNome(nome);
    }

    //Métodos get/set
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
}
