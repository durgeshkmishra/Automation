package DayTwo;
import java.util.Scanner;
public class ExcerciseProgram1 {
    public static void main(String[] args) {
        int num1,num2,sum;
//Create a scanner object to read the input from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        num1 = input.nextInt();
        System.out.println("Enter the second number");
        num2 = input.nextInt();
        sum = num1 + num2;
        System.out.println("The sum is " + sum);
    }
}
