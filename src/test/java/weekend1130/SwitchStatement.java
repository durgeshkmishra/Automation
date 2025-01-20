package weekend1130;
import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        //day =1 Monday, 2 Tuesday,3 Wed
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Day-");
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;

        }

    }
}
