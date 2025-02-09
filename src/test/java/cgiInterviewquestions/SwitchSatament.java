package cgiInterviewquestions;

import javax.script.SimpleScriptContext;
import java.util.Scanner;

public class SwitchSatament {
    public static void main(String[] args) {
        simpleCalculator();
        weekdays();
    }
    public static void simpleCalculator()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int a = sc.nextInt();
        System.out.println("Enter the second Number ");
        int b = sc.nextInt();
        System.out.println("Enter the any one  operator from the list : +,-,/*");

        char operator = sc.next().charAt(0);
        double  result;

        switch (operator)
        {
            case '+':
                result = a +b;
                System.out.println("the result of sum is " + result);
                break;
            case '-':
                result = a-b;
                System.out.println("The result of difference is " + result);
                break;
            case '*':
                result = a*b;
                System.out.println("the result of multiplication is " +result);
            case '/':
                if (b != 0)
                {
                    result = a/b;
                    System.out.println("division result is " +result);

                }
                else
                {
                    System.out.println("divison with zero not allowed");
                }
                break;
            default:
                System.out.println("use the right operator");

        }
        //sc.close();

    }
    public static void weekdays()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day name");
        String wdays = sc.next();
        switch (wdays)
        {
            case "monday":
                System.out.println("Weekdays");
                break;
            case "tuesday":
                System.out.println("Weekdays");
                break;
            case "wednesday":
                System.out.println("Weekdays");
                break;
            case "thrusday":
                System.out.println("Weekdays");
                break;
            case "Friday":
                System.out.println("Weekdays");
                break;
            case "saturday":
                System.out.println("weekend");
                break;
            case "sunday":
                System.out.println("weekend");
                break;
            default:
                System.out.println("'Enter valid entry");
                break;

        }
    }
    //sc.close();
}
