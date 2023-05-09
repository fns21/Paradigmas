import java.util.Scanner;

public class OddEvenNum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num;

        num = input.nextInt();

        if((num % 2) == 0)
            System.out.println("Par");
        else
            System.out.println("Ímpar");
            
        input.close();
    }
}
