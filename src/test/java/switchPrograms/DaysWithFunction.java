package switchPrograms;

import java.util.Scanner;

public class DaysWithFunction {
    static String days; // class level Variable

    public static void main(String[] args) {
        GetDaysInput(); // Fn to get the user input
        DaysClaculation(days); // Days calculation

    }
    static void GetDaysInput()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Day Name - ");
        days = input.next().toLowerCase();
        System.out.println("Given Days Name is - " +days);
    }
    static void DaysClaculation(String days)
    {
     switch(days){
         case "monday":
         case "tuesday":
         case  "wednesday":
         case "thrusday":
         case "friday":
             System.out.println("Week days");
             break;
         case "saturday":
         case "sunday":
             System.out.println("Weekend");
             break;
         default:
             System.out.println("Invalid day entered. Please enter a valid day of the week.");

     }
    }
    }

