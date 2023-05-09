package ParadigmasSemana3.Ex3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dia1, dia2, dia3, mes1, mes2, mes3, ano1, ano2, ano3;

        dia1 = input.nextInt();
        mes1 = input.nextInt();
        ano1 = input.nextInt();
        dia2 = input.nextInt();
        mes2 = input.nextInt();
        ano2 = input.nextInt();
        dia3 = input.nextInt();
        mes3 = input.nextInt();
        ano3 = input.nextInt();

        Data data1 = new Data(dia1, mes1, ano1);
        Data data2 = new Data(dia2, mes2, ano2);
        Data data3 = new Data(dia3, mes3, ano3);

        if(data1.anterior(data2) && data3.posterior(data2)){
            System.out.println("1ª ordenação");
            System.out.println(data1.toString());
            System.out.println(data2.toString());
            System.out.println(data3.toString());
        }
        else if(data1.anterior(data3) && data2.posterior(data3)){
            System.out.println("2ª ordenação");
            System.out.println(data1.toString());
            System.out.println(data3.toString());
            System.out.println(data2.toString());
        }
        else if(data3.anterior(data2) && data1.posterior(data2)){
            System.out.println("3ª ordenação");
            System.out.println(data3.toString());
            System.out.println(data2.toString());
            System.out.println(data1.toString());  
        }
        else if(data3.anterior(data1) && data2.posterior(data1)){
            System.out.println("4ª ordenação");
            System.out.println(data3.toString());
            System.out.println(data1.toString());
            System.out.println(data2.toString());  
        }
        else if(data2.anterior(data1) && data3.posterior(data1)){
            System.out.println("5ª ordenação");
            System.out.println(data2.toString());
            System.out.println(data1.toString());
            System.out.println(data3.toString());
        }
        else if(data2.anterior(data3) && data1.posterior(data3)){
            System.out.println("6ª ordenação");
            System.out.println(data2.toString());
            System.out.println(data3.toString());
            System.out.println(data1.toString());
        }

        input.close();
    }
}
