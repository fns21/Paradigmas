import java.util.ArrayList;
import java.util.List;

public class Jogo {
    // Atributos
    private List<Jogador> jogadores;
    private List<FakeNews> fakeNewsList;
    private List<Item> itemList;
    private Posicao[] posicoes;

    // Construtor
    public Jogo() {
        jogadores = new ArrayList<>();
        fakeNewsList = new ArrayList<>();
        itemList = new ArrayList<>();
        posicoes = new Posicao[4];
    }

    // Métodos get/set
    public Jogador getJogador(int ind) {
        return jogadores.get(ind);
    }

    public void setJogador(Jogador jogador, int ind) {
        jogadores.set(ind, jogador);
    }

    public void inicializaJogador(InterfaceTerminal terminal, Setor[][] casa) {
        posicoes[0] = new Posicao(4, 0);
        posicoes[1] = new Posicao(8, 4);
        posicoes[2] = new Posicao(4, 8);
        posicoes[3] = new Posicao(0, 4);

        int numJogadores = terminal.getNumJogadores();
        for (int i = 0; i < numJogadores; i++) {
            Jogador jogador = new Jogador(posicoes[i], "J" + (i + 1));
            jogadores.add(jogador);
            casa[posicoes[i].getY()][posicoes[i].getX()].setJogador(jogador);
        }
    }

    public void inicializaFakeNews(Setor[][] casa) {
        GeradorAleatorio randPosX = new GeradorAleatorio();
        GeradorAleatorio randPosY = new GeradorAleatorio();
        Posicao concatPos;

        for (int i = 0; i < 6; i++) {
            randPosX.setAleatorio(7);
            randPosY.setAleatorio(7);

            int linha = randPosX.getAleatorio();
            int coluna = randPosY.getAleatorio();

            concatPos = new Posicao(linha + 1, coluna + 1);

            // Verificar se a posição já está ocupada por um jogador ou fakenews
            while (verificaCasa(casa, concatPos)) {
                randPosX.setAleatorio(7);
                randPosY.setAleatorio(7);
                linha = randPosX.getAleatorio();
                coluna = randPosY.getAleatorio();
                concatPos = new Posicao(linha + 1, coluna + 1);
            }

            int tipo = i % 3 + 1;
            FakeNews fakeNews = new FakeNews(concatPos, "F" + tipo);
            fakeNewsList.add(fakeNews);

            casa[fakeNews.getPosicao().getX()][fakeNews.getPosicao().getY()].setFakeNews(fakeNews);
        }
    }

    public void inicializaSetor(Setor[][] casa) {
        GeradorAleatorio randPosX = new GeradorAleatorio();
        GeradorAleatorio randPosY = new GeradorAleatorio();
        Posicao concatPos;

        for (int i = 0; i < 4; i++) {
            randPosX.setAleatorio(9);
            randPosY.setAleatorio(9);

            int linha = randPosX.getAleatorio();
            int coluna = randPosY.getAleatorio();

            concatPos = new Posicao(linha, coluna);

            // Verificar se a posição já está ocupada por um jogador, fake news ou é restrita
            while (verificaCasa(casa, concatPos)) {
                randPosX.setAleatorio(9);
                randPosY.setAleatorio(9);
                linha = randPosX.getAleatorio();
                coluna = randPosY.getAleatorio();
                concatPos = new Posicao(linha, coluna);
            }

            casa[concatPos.getX()][concatPos.getY()].setRestrito(true);
        }
    }

    public void inicializaItem(Setor[][] casa) {
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

            // Verificar se a posição já está ocupada por um jogador, fake news, é restrita ou possui item
            while (verificaCasa(casa, concatPos)) {
                randPosX.setAleatorio(9);
                randPosY.setAleatorio(9);
                linha = randPosX.getAleatorio();
                coluna = randPosY.getAleatorio();
                concatPos = new Posicao(linha, coluna);
            }

            switch (randTipo.getAleatorio()) {
                case 0:
                    itemList.add(new DenunciarFakeNewsItem(concatPos));
                    break;
                case 1:
                    itemList.add(new FugirItem(concatPos));
                    break;
                case 2:
                    itemList.add(new LerNoticiaRealItem(concatPos));
                    break;
                case 3:
                    itemList.add(new OuvirBoatoItem(concatPos));
                    break;
                default:
                    break;
            }
            casa[concatPos.getX()][concatPos.getY()].setItem(itemList.get(i));
        }
    }

    public boolean verificaCasa(Setor casa[][], Posicao concatPos){
        return (casa[concatPos.getX()][concatPos.getY()].getFakeNews() != null)
        || (casa[concatPos.getX()][concatPos.getY()].getJogador() != null)
        || (casa[concatPos.getX()][concatPos.getY()].getRestrito() != false)
        || (casa[concatPos.getX()][concatPos.getY()].getItem() != null);
    }

    public void atualizaFakeNews(Tabuleiro tabuleiro, Setor[][] casa) {
        for (FakeNews fakeNews : fakeNewsList) {
            Posicao antigaPosicao = fakeNews.getPosicao();
            fakeNews.movimentar();
            Posicao novaPosicao = fakeNews.getPosicao();

            //Informa o movimento de cada fakenews
            System.out.print("\n\n");
            System.out.println(fakeNews.getNome() + ": " + "(" + antigaPosicao.getX() + ", " + antigaPosicao.getY() + ")" + " ---> " + "(" + novaPosicao.getX() + ", " + novaPosicao.getY() + ")");

            if(casa[novaPosicao.getX()][novaPosicao.getY()].getRestrito() == true){
                casa[novaPosicao.getX()][novaPosicao.getY()].setFakeNews(null);
                System.out.println("A Fake News " + fakeNews.getNome() + " foi eliminada por entrar em setor privado!");
            }
            else
                casa[novaPosicao.getX()][novaPosicao.getY()].setFakeNews(fakeNews);
            casa[antigaPosicao.getX()][antigaPosicao.getY()].setFakeNews(null);
            
            //Intervalo de 2seg entre cada movimentação de fakenews
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }


            tabuleiro.desenhaTabuleiro(casa);
        }
    }

    public void atualizarJogadores(Tabuleiro tabuleiro, Setor[][] casa, InterfaceTerminal terminal){
        for(Jogador jogador : jogadores){
            
        }
    }
}
