public class Jogador extends Peca {
    
    //Atributos
    private String nome;

    //Construtor
    public Jogador(int linha, int coluna, String nome){
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

    //Outros métodos
    public void inicializaJogadores(Jogador[] jogadores){
        jogadores[0] = new Jogador(0, 4, "J1");
        jogadores[1] = new Jogador(4, 8, "J2");
        jogadores[2] = new Jogador(8, 4, "J3");
        jogadores[3] = new Jogador(4, 0, "J4"); 

    }

    public int moveCima(){
        if(this.linha > 0){
            this.linha--;
            return 1;
        }
        return 0;
    }

    public int moveEsquerda(){
        if(this.coluna > 0){
            this.coluna--;
            return 1;
        }
        return 0;
    }

    public int moveBaixo(){
        if(this.linha < 8){
            this.linha++;
            return 1;
        }
        return 0;
    }

    public int moveDireita(){
        if(this.coluna < 8){
            this.coluna++;
            return 1;
        }
        return 0;
    }

}
