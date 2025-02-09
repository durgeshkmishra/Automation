package cgiInterviewquestions;

import java.util.Scanner;
//Question: Write a Java program to find the factorial of a number using recursion.

public class FactorialPrimeFabonoci {
    public static void main(String[] args) {
        int a= 6;
        int b =7;
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number");
//        System.out.print("Enter the number");
//        System.out.print("Enter the number");
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println(num);
        factorialCheck(num);
        int result = factorialrecursion(num);
        System.out.println("using recursive factorial method " + result);
         primeNumberCheck(num);
        fabonociSeries(num);
        additionOfNumber( a, b);

    }

    public static void factorialCheck(int num1) {
        int fact1 = 1;

        for (int i = num1; i >= 1; i--)
        {
            fact1 = fact1 * i;
        }
        System.out.println("Factotial of the given numeebr is-" + fact1);
    }
    public static void primeNumberCheck(int num1)
    {
        if(num1/2 ==0)
        {
            System.out.println("Given Numebr is Prime");
        }
        else
        {
            System.out.println("Given Numebr is not prime");
        }
    }
    public static void  fabonociSeries(int num1)
    {
        int f1 = 0;
        int f2 = 1;
        System.out.print("Fabenoci series up to "+ num1 + " is -: " + f1 + " " + f2 +" ");
        for (int i = 2 ;i <= num1+1 ; i ++)
        {
            int next  = f1 + f2;

               if(next > num1) {
                   break;
               }
            System.out.print(next + " ");
             f1 = f2;
             f2 = next;
        }
    }
    public static void additionOfNumber(int a,int b)
    {
        int sum = a +b;
        System.out.println("sum of the given number is -:" + sum);
    }
    public static int factorialrecursion(int num)
    {
        if (num == 0 || num == 1)
        {
            return 1;

        }
        else
        {
            return  num*factorialrecursion(num-1);
        }
    }

}
