package DayTwo;
import java.util.Scanner;
public class ExcerciseProgram2 {
    public static void main(String[] args) {
        int num1,num2,result;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        num1 = input.nextInt();
        System.out.println("Enter the second number");
        num2 = input.nextInt();
        result = num1 * num2;
        System.out.println();
        System.out.println("The resulet is " + result);
    }
}
