package weekend1130;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        //pen = $10 book = $40
        //Check the buyer strength
        double i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the $ Amount-");
        i = sc.nextDouble();
        if (i>10 && i< 50){
            System.out.println("Consume can buy only Pen");
                    }
        if (i>50){
            System.out.println("Consumer can buy both pen and book");
        }else System.out.println("Consumer cant buy anythingh");

    }
}
