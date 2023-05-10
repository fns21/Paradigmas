public class Peca{

    //Atributos
    protected int linha;
    protected int coluna;
    
    //Construtor
    public Peca(int linha, int coluna){
        this.setLinha(linha);
        this.setColuna(coluna);
    }

    //Métodos get/set
    public int getLinha(){
        return this.linha;
    }

    public int getColuna(){
        return this.coluna;
    }

    public void setLinha(int linha){
        if(linha >= 0 && linha < 9)
            this.linha = linha;
    }

    public void setColuna(int coluna){
        if(coluna >= 0 && coluna < 9)
            this.coluna = coluna;
    }

}