import java.util.Scanner;

public class InterfaceTerminal {
    
    //Atributos
    private Scanner input = new Scanner(System.in);
    private int numJogadores;

    //Construtor
    public InterfaceTerminal(){
        this.setNumJogadores(0);
    }

    //Métodos get/set
    public int getNumJogadores(){
        return this.numJogadores;
    }
    
    public void setNumJogadores(int numJogadores){
        if(numJogadores > 0 && numJogadores <= 4)
            this.numJogadores = numJogadores;
    }

    //Outros métodos
    public void menuInicializacao(){
        System.out.print(Cores.ANSI_CYAN + "\n##Bem Vindo Ao Jogo 'Corra das Fake News'!##\n\n");

        System.out.print(Cores.ANSI_CYAN + " ----------------------------- \n" + Cores.ANSI_RESET);
        System.out.print(Cores.ANSI_CYAN + "|" + Cores.ANSI_WHITE + "         1 Jogador           " + Cores.ANSI_CYAN + "|\n");
        System.out.print(Cores.ANSI_CYAN + " ----------------------------- \n" + Cores.ANSI_RESET);

        System.out.print(Cores.ANSI_CYAN + " ----------------------------- \n" + Cores.ANSI_RESET);
        System.out.print(Cores.ANSI_CYAN + "|" + Cores.ANSI_WHITE + "         2 Jogadores         " + Cores.ANSI_CYAN + "|\n");
        System.out.print(Cores.ANSI_CYAN + " ----------------------------- \n" + Cores.ANSI_RESET);

        System.out.print(Cores.ANSI_CYAN + " ----------------------------- \n" + Cores.ANSI_RESET);
        System.out.print(Cores.ANSI_CYAN + "|" + Cores.ANSI_WHITE + "         3 Jogadores         " + Cores.ANSI_CYAN + "|\n");
        System.out.print(Cores.ANSI_CYAN + " ----------------------------- \n" + Cores.ANSI_RESET);

        System.out.print(Cores.ANSI_CYAN + " ----------------------------- \n" + Cores.ANSI_RESET);
        System.out.print(Cores.ANSI_CYAN + "|" + Cores.ANSI_WHITE + "         4 Jogadores         " + Cores.ANSI_CYAN +  "|\n");
        System.out.print(Cores.ANSI_CYAN + " ----------------------------- \n\n" + Cores.ANSI_RESET);

        System.out.print("Digite uma opção: \n");

        this.setNumJogadores(input.nextInt());
        if(getNumJogadores() == 0)
            this.menuInicializacao(); 
    }

    public void caixaSelecao(){
        System.out.print(Cores.ANSI_CYAN + "+---------------------+\n" + Cores.ANSI_RESET);
        System.out.print(Cores.ANSI_CYAN + "|" + Cores.ANSI_WHITE + "1    Mover         👣" + Cores.ANSI_CYAN + "|\n");
        System.out.print(Cores.ANSI_CYAN + "+---------------------+\n" + Cores.ANSI_RESET);

        System.out.print(Cores.ANSI_CYAN + "+---------------------+\n" + Cores.ANSI_RESET);
        System.out.print(Cores.ANSI_CYAN + "|" + Cores.ANSI_WHITE + "2    Ação          ⁉️ " + Cores.ANSI_CYAN + "|\n");
        System.out.print(Cores.ANSI_CYAN + "+---------------------+\n" + Cores.ANSI_RESET);
    }

    public void caixaMovimento(){
        System.out.print(Cores.ANSI_CYAN + "+---------------------+\n" + Cores.ANSI_RESET);
        System.out.print(Cores.ANSI_CYAN + "|" + Cores.ANSI_WHITE + "1    Cima          ⬆️ " + Cores.ANSI_CYAN + "|\n");
        System.out.print(Cores.ANSI_CYAN + "+---------------------+\n" + Cores.ANSI_RESET);

        System.out.print(Cores.ANSI_CYAN + "+---------------------+\n" + Cores.ANSI_RESET);
        System.out.print(Cores.ANSI_CYAN + "|" + Cores.ANSI_WHITE + "2    Baixo         ⬇️ " + Cores.ANSI_CYAN + "|\n");
        System.out.print(Cores.ANSI_CYAN + "+---------------------+\n" + Cores.ANSI_RESET);

        System.out.print(Cores.ANSI_CYAN + "+---------------------+\n" + Cores.ANSI_RESET);
        System.out.print(Cores.ANSI_CYAN + "|" + Cores.ANSI_WHITE + "3    Direita       ➡️ " + Cores.ANSI_CYAN + "|\n");
        System.out.print(Cores.ANSI_CYAN + "+---------------------+\n" + Cores.ANSI_RESET);

        System.out.print(Cores.ANSI_CYAN + "+---------------------+\n" + Cores.ANSI_RESET);
        System.out.print(Cores.ANSI_CYAN + "|" + Cores.ANSI_WHITE + "4    Esquerda      ⬅️ " + Cores.ANSI_CYAN + "|\n");
        System.out.print(Cores.ANSI_CYAN + "+---------------------+\n" + Cores.ANSI_RESET);
    }

    public void caixaAcao(){
        System.out.print(Cores.ANSI_CYAN + "+-----------------------------------+\n" + Cores.ANSI_RESET);
        System.out.print(Cores.ANSI_CYAN + "|" + Cores.ANSI_WHITE + "1    Denunciar FakeNews          ⚠️ " + Cores.ANSI_CYAN + "|\n");
        System.out.print(Cores.ANSI_CYAN + "+-----------------------------------+\n" + Cores.ANSI_RESET);

        System.out.print(Cores.ANSI_CYAN + "+-----------------------------------+\n" + Cores.ANSI_RESET);
        System.out.print(Cores.ANSI_CYAN + "|" + Cores.ANSI_WHITE + "2    Fugir                       💨" + Cores.ANSI_CYAN + "|\n");
        System.out.print(Cores.ANSI_CYAN + "+-----------------------------------+\n" + Cores.ANSI_RESET);

        System.out.print(Cores.ANSI_CYAN + "+-----------------------------------+\n" + Cores.ANSI_RESET);
        System.out.print(Cores.ANSI_CYAN + "|" + Cores.ANSI_WHITE + "3    Ler Notícia Real            📰" + Cores.ANSI_CYAN + "|\n");
        System.out.print(Cores.ANSI_CYAN + "+-----------------------------------+\n" + Cores.ANSI_RESET);

        System.out.print(Cores.ANSI_CYAN + "+-----------------------------------+\n" + Cores.ANSI_RESET);
        System.out.print(Cores.ANSI_CYAN + "|" + Cores.ANSI_WHITE + "4    Ouvir Boato                 👂" + Cores.ANSI_CYAN + "|\n");
        System.out.print(Cores.ANSI_CYAN + "+-----------------------------------+\n" + Cores.ANSI_RESET);
    }
}
