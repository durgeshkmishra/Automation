package DayOne;

public class MaxOfThreeNumbers {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 8;
        int num3 = 10;
        if (num1 > num2 && num1 > num3) System.out.println(num1);
        else if (num2 > num1 && num2 > num3) System.out.println(num2);
        else System.out.println(num3);
    }
}

