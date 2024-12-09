package weekend1130;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        int x,y;
    Scanner sc = new Scanner(System.in);
    //Enter the Number
        System.out.println("Enter the First Number-");
        x= sc.nextInt();
        System.out.println("Enter the Second Number-");
        y = sc.nextInt();
        x= x+y;
        y=x-y;
        x= x-y;
        System.out.println("Print First number-"+x);
        System.out.println("Print second number-"+y);

}
}

