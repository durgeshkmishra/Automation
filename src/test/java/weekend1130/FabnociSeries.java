package weekend1130;

import java.util.Scanner;

public class FabnociSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 1;
        int num ;
        //Enter the number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number for Fabnoci Series-");
        num = sc.nextInt();
        System.out.println(num);
        //Create the Fabonoci series
        for (int i=1;i<=num;i++){
            a=b;
            b=c;
            c=a+b;
            System.out.println(a);

        }

    }
}
