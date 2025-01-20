package weekend1130;

import java.sql.SQLOutput;

public class StringExample {
    public static void main(String[] args) {
        String str = "abcde".repeat(100);
        System.out.println(str.charAt(4));
        String str1 = "Counting character in a sytring";
        System.out.println("Character at string 10="+str1.charAt(10));
        String str2 = "HelloWorld";
        String str3 = str2.substring(5);
        String str4 = "World";
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
        String str5 =  "concanatenate";
        str5 = str5.substring(3,8).concat(str5.substring(1,4)).concat(str5.substring(0,2));
        System.out.println(str5);
        String str6 = "hellojava";
        int index = str6.indexOf("java")-2;
        System.out.println(str6.substring(index));

    }
}
