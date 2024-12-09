package weekend1130;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String you want to reverse-");
        String st = sc.next();
        System.out.println(st);
        // Reverse the string using StringBuilder
        StringBuilder st2 = new StringBuilder(st);
        System.out.println(st2);
        st2.reverse();  // Reverse the string
       System.out.println("Reversed String: " + st2.toString());  // Output the reversed string

    }
}
