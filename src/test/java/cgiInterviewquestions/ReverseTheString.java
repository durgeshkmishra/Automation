package cgiInterviewquestions;

import java.util.Scanner;

public class ReverseTheString {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        str = sc.next();
        System.out.println(str);
        //Logic to reverse the string
        //StringBuilder sb = new StringBuilder(str);
        //sb.reverse();
        //String str1 = sb.toString();
        String reversedString = new StringBuilder(str).reverse().toString();
        System.out.println(reversedString);
        //System.out.println(str1);
// create a method to reverse the string without the builtin function
        reversedGivenString(str);
    }
    public static void reversedGivenString(String str1) {
        int len = str1.length();
        String revs = "";
        
        System.out.println(len);
        //logic to reverse the string
        for (int i = 0; i < len; i++) {
            revs =  str1.charAt(i)+ revs;
        }

        System.out.println(revs);
    }
}
