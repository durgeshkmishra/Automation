package DayTwo;
import java.util.Scanner;
public class ExcersiseProgram3 {
    public static void main(String[] arg){
        int num1;
        //
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number");
        num1 = input.nextInt();
        if (num1%2==0)
            System.out.println("No is Even");
            else System.out.println("No is odd");

    }

}
