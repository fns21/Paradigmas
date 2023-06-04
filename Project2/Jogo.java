public class Jogo {
    
    //Atributos
    private Jogador jogador[];
    private FakeNews fn[] = new FakeNews[6];
    private Item item[] = new Item[2];
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

    public void inicializaJogador(InterfaceTerminal terminal, Setor casa[][]){
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

    public void inicializaFakeNews(Setor casa[][]) {
        GeradorAleatorio randPosX = new GeradorAleatorio();
        GeradorAleatorio randPosY = new GeradorAleatorio();
        Posicao concatPos;
    
        for (int i = 0; i < 6; i++) {
            randPosX.setAleatorio(7);
            randPosY.setAleatorio(7);
    
            int linha = randPosX.getAleatorio();
            int coluna = randPosY.getAleatorio();
    
            concatPos = new Posicao(linha + 1, coluna + 1);
    
            // Verificar se a posição está vazia (null) ou se já está ocupada por um jogador ou fakenews
            while ((casa[concatPos.getY()][concatPos.getX()].getFakeNews() != null) || (casa[concatPos.getY()][concatPos.getX()].getJogador() != null)) {
                randPosX.setAleatorio(7);
                randPosY.setAleatorio(7);
                linha = randPosX.getAleatorio();
                coluna = randPosY.getAleatorio();
                concatPos = new Posicao(linha + 1, coluna + 1);
            }
    
            int tipo = i % 3 + 1;
            fn[i] = new FakeNews(concatPos, tipo, "F" + tipo);
    
            casa[fn[i].getPosicao().getY()][fn[i].getPosicao().getX()].setFakeNews(fn[i]);
        }
    }

    public void inicializaSetor(Setor casa[][]){
        GeradorAleatorio randPosX = new GeradorAleatorio();
        GeradorAleatorio randPosY = new GeradorAleatorio();
        Posicao concatPos;
    
        for (int i = 0; i < 4; i++) {
            randPosX.setAleatorio(9);
            randPosY.setAleatorio(9);
    
            int linha = randPosX.getAleatorio();
            int coluna = randPosY.getAleatorio();
    
            concatPos = new Posicao(linha, coluna);
    
            // Verificar se a posição está vazia (null) ou se já está ocupada por um jogador ou fakenews
            while ((casa[concatPos.getY()][concatPos.getX()].getFakeNews() != null) || (casa[concatPos.getY()][concatPos.getX()].getJogador() != null)) {
                randPosX.setAleatorio(9);
                randPosY.setAleatorio(9);
                linha = randPosX.getAleatorio();
                coluna = randPosY.getAleatorio();
                concatPos = new Posicao(linha, coluna);
            }

            
            casa[concatPos.getY()][concatPos.getX()].setRestrito(true);
        }
    }

    public void inicializaItem(Setor casa[][]){
        GeradorAleatorio randPosX = new GeradorAleatorio();
        GeradorAleatorio randPosY = new GeradorAleatorio();
        GeradorAleatorio randTipo = new GeradorAleatorio();
        Posicao concatPos;
    
        for (int i = 0; i < 2; i++) {
            randPosX.setAleatorio(9);
            randPosY.setAleatorio(9);
            randTipo.setAleatorio(4);
    
            int linha = randPosX.getAleatorio();
            int coluna = randPosY.getAleatorio();
    
            concatPos = new Posicao(linha, coluna);
    
            // Verificar se a posição está vazia (null) ou se já está ocupada por um jogador ou fakenews
            while ((casa[concatPos.getY()][concatPos.getX()].getFakeNews() != null) || (casa[concatPos.getY()][concatPos.getX()].getJogador() != null)) {
                randPosX.setAleatorio(9);
                randPosY.setAleatorio(9);
                linha = randPosX.getAleatorio();
                coluna = randPosY.getAleatorio();
                concatPos = new Posicao(linha, coluna);
            }

            switch(randTipo.getAleatorio()){
                case 0:
                    item[i] = new DenunciarFakeNewsItem(concatPos);
                    break;
                case 1:
                    item[i] = new FugirItem(concatPos);
                    break;
                case 2:
                    item[i] = new LerNoticiaRealItem(concatPos);
                    break;
                case 3:
                    item[i] = new OuvirBoatoItem(concatPos);
                    break;
                default:
                    break;
            }
            casa[concatPos.getY()][concatPos.getX()].setItem(item[i]);
        }
    }
    
}
