package breakoutClass;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Select the option-");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        //prompt the user to enter the choice
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        //int i,j,k,l,m;
switch (choice)
{
    case(1):
        System.out.println("Enter the number one= ");
        int i = input.nextInt();
        System.out.println("Enter the number two- ");
        int j = input.nextInt();
        System.out.println("Addition of the number is " +(i+j));
        break;
    case(2):
        System.out.println("Enter the First number ");
        int l = input.nextInt();

        System.out.println("Enter the second number ");
        int m = input.nextInt();
        int k;
        if(l>m)
        {
            k = l-m;
        }
        else {
            k = m - l;
        }
        System.out.println("Difference of these number are " +k);
        break;
        case(4):
            System.out.println("Enter the First Number ");
            int a = input.nextInt();
            System.out.println("Enter the second Number ");
            int b = input.nextInt();
            int c = a/b;
            System.out.println("Divison of the number is " +c);
            break;
    case(3):
        System.out.println("Enter the First Number ");
        int e = input.nextInt();
        System.out.println("Enter the second Number ");
        int f = input.nextInt();
        int g = e*f;
        System.out.println("Divison of the number is " +g);
        break;

}

    }

}
