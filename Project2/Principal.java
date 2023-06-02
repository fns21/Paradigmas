public class Principal {
    public static void main(String[] args) {

        InterfaceTerminal terminal = new InterfaceTerminal();
        Setor casa[][] = new Setor[9][9];
        Jogo jogo = new Jogo();
        Tabuleiro tabuleiro = new Tabuleiro(casa);
        
        terminal.menuInicializacao();
        jogo.inicializaJogo(terminal, casa);
        terminal.inicializaTabuleiro(tabuleiro, casa);
    }
}