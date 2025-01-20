package DayTwo;
import java.util.Scanner;
//import java.util.Scanner;
public class FactorialChecker {
    public static void main(String[] args) {

        int num1;
        int fact1 = 1;
//Create a object input called as a rference variable

        Scanner input = new Scanner(System.in);
//Enter the No
        System.out.println("Enter the Number-");

        num1 = input.nextInt();
        for (int i = 1; i <= num1; i++) {


            fact1 = fact1 * i;
        }
//Print the Result("Factorial of the Given number is -" + fact1);
        System.out.println("Factorial of the Given Number is-"+fact1);
    }
}
