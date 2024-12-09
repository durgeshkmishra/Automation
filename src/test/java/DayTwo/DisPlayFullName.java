package DayTwo;
import java.util.Scanner;
public class DisPlayFullName {
    public static void main(String[] args) {
        String fname, lname;
       Scanner input = new Scanner(System.in);
        System.out.println("Enter First Name");
        fname = input.next();
        System.out.println("Enter Last Name");
        lname = input.next();
        System.out.println("Full Name is " +fname +' ' + lname);


    }
}
