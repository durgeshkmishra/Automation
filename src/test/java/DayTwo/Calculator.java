package DayTwo;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int num1;
        int num2;
        int result = 0;
        char caLc;
        Scanner input = new Scanner(System.in);

        // Enter the input values
        System.out.println("Enter the First Number-");
        num1 = input.nextInt();
        System.out.println("Enter the Second Number-");
        num2 = input.nextInt();
        System.out.println("Enter the Operator (+, -, *, /)-");
        caLc = input.next().charAt(0);  // Read the operator as a char

        // Perform calculations based on the operator
        if (caLc == '+') {
            result = num1 + num2;
        } else if (caLc == '-') {
            result = num1 - num2;
        } else if (caLc == '*') {
            result = num1 * num2;
        } else if (caLc == '/') {
            if (num2 == 0) {
                System.out.println("Error: Division by zero is not allowed.");
                return;  // Exit if division by zero
            }
            result = num1 / num2;
        } else {
            // If the operator is not valid
            System.out.println("Invalid operator! Please use one of (+, -, *, /).");
            return;  // Exit if the operator is invalid
        }

        // Display the result
        System.out.println("Result: " + result);

        // Close the scanner to avoid memory leaks
        input.close();
    }
}
