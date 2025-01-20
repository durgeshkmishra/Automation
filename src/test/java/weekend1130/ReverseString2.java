package weekend1130;

import java.util.Scanner;

public class ReverseString2 {
    public static void main(String[] args) {
        String reversed = "";
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        System.out.println(st);
        //sture this string into array
        String[] st2 = st.split("");
        for (int i = 0; i < st2.length; i++) {
            System.out.println(st2[i]);
        }
       // System.out.println(st2.length);
        for (int i = st2.length-1; i>=0;i--){
            reversed = reversed + st2[i];

        }
        System.out.println(reversed);
    }
}
