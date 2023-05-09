import java.util.Scanner;

public class SumNum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num, temp;

        num = 0; //Em java, variáveis já são inicializadas com 0, mas para manter as boas práticas...
        temp = input.nextInt();
        while (temp != -1){
            num = num + temp;
            temp = input.nextInt();
        }

        System.out.println("Resultado: " + num);

        input.close();
    }
}
