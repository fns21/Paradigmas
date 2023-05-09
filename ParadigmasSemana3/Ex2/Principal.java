package ParadigmasSemana3.Ex2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int hour1, hour2, min1, min2;

        hour1 = input.nextInt();
        min1 = input.nextInt();
        hour2 = input.nextInt();
        min2 = input.nextInt();
        
        Time time1 = new Time(hour1, min1);
        Time time2 = new Time(hour2, min2);

        System.out.println(time1.toString());
        System.out.println(time2.toString());

        if(time1.anterior(hour2, min2))
            System.out.println("time1 anterior a time2");
        else if(time1.posterior(hour2, min2))
            System.out.println("time1 posterior a time2");
        else if(time1.equals(hour2, min2))
            System.out.println("time1 igual a time2");

        input.close();
    }
}
