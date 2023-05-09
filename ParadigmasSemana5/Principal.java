import java.util.Scanner;

public class Principal {

    public static void main (String args[]){
        Scanner input = new Scanner(System.in);

        CartaoWeb cartao[] = new CartaoWeb[3];
        CartaoAniversario niver = new CartaoAniversario("Rachel");
        CartaoNatal natal = new CartaoNatal("Rachel");
        CartaoDiaDosNamorados namor = new CartaoDiaDosNamorados("Rachel");

        cartao[0] = niver;
        cartao[1] = natal;
        cartao[2] = namor;

        String remetente = input.nextLine();

        for(int i = 0; i < 3; i++){
            System.out.println(cartao[i].retornarMensagem(remetente));
        }

        input.close();
    }
}
