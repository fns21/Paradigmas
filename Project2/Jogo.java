public class Jogo {
    
    //Atributos
    private Jogador jogador[];
    private Posicao J[] = new Posicao[4];

    //Construtor
    public Jogo(){}
    
    //Métodos get/set
    public Jogador getJogador(int ind){
        return this.jogador[ind];
    }
    
    public void setJogador(Jogador jogador, int ind){
        this.jogador[ind] = jogador;
    }

    public void inicializaJogo(InterfaceTerminal terminal, Setor casa[][]) {
        J[0] = new Posicao(4, 0);
        J[1] = new Posicao(8, 4);
        J[2] = new Posicao(4, 8);
        J[3] = new Posicao(0, 4);

        int numJogadores = terminal.getNumJogadores();
        this.jogador = new Jogador[numJogadores];
        
        for (int i = 0; i < numJogadores; i++) {
            jogador[i] = new Jogador(J[i], "J" + (i + 1));
            casa[J[i].getY()][J[i].getX()].setJogador(jogador[i]);
        }
    }
}
