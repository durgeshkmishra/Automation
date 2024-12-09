package DayOne;

public class CountDigits {
    public static void main(String[] args) {
        int i = 123456;
        int count = 0;
        while (i !=0) {
            i = i/10;
            count = count +1;
        }
        System.out.println(count);
    }
}
