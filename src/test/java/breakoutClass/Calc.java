package breakoutClass;
import java.util.Scanner;

public class Calc {


    public static void main(String[] args) {
        double num1;
        double num2;
        double result;
        char operator;
        Scanner input = new Scanner(System.in);
        //Enter the value
        System.out.println("Enter the first Number-");
        num1 = input.nextDouble();
        System.out.println("Enter the Second Number-");
        num2 = input.nextDouble();
        System.out.println("Enter the Operator");
        operator = input.next().charAt(0);

        //Perform the operation
        if (operator == '+') {
            result = num1 + num2;
            System.out.println("Addition of the Given Numebr is = " + result);

        } else if (operator == '-') {

            result = num1 - num2;
            System.out.println("Difference between given number is = " + result);

        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println("Multiplication of given number is = " + result);

        } else if (operator == '/') {
            result = num1 / num2;
            System.out.println("Divided value of given Number is  = " + result);

        } else if (operator == '%') {
            result = num1 % num2;
            System.out.println("Reminder of the given numebr = " + result);

        } else if (operator == '!') {
            result = 1;
            for (int i = 1; i <= num1; i++) {
                result = result * i;

            }

            System.out.println("Factorial of the given numebr = " + result);
            result = 1;
            for (int i = 1; i <= num2; i++) {
                result = result * i;

            }
            System.out.println("Factoril of the given numebr = " + result);
        }


    }
}

