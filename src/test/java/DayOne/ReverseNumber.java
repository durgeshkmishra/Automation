package DayOne;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 459;
        int digit;
        int reverse =0;
        System.out.println(num);
        while (num!=0) {
            digit = num%10;
            reverse = reverse*10 + digit;
            num = num/10;
        }
        System.out.println(reverse);
    }
}
