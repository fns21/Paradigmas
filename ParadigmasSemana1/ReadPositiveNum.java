import java.util.Scanner;

public class ReadPositiveNum{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Digite um número:");

        num = input.nextInt();

        System.out.println("O número " + num + " é positivo?");

        if(num > 0)
            System.out.println("Sim");
        else
            System.out.println("Não");

        input.close();
    }
}