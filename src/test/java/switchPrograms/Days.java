package switchPrograms;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Name of Days-");
        String days = input.next().toLowerCase();
        System.out.println("The days you enter is - " + days);
        switch (days) {
            case "monday" :
                System.out.println("week days");
                break;
            case "tuesday" :
                System.out.println("week days");
                break;
            case "wednesday" :
                System.out.println("week days");
                break;
            case "thrusday" :
                System.out.println("week days");
                break;
            case "friday" :
                System.out.println("week days");
                break;
            case "saturday" :
                System.out.println("weekend");
                break;
            case "sunday" :
                System.out.println("weekend");
                break;

        }
    }
}
