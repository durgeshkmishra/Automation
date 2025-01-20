package DayOne;

public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 5000;
        double rate = 8.9;
        double interest = 5.8;
        int time = 3;
        double compoundInterest = (principal * (Math.pow((1 + rate / 100), time))) - principal;
        System.out.println("Calculated Interest is " +compoundInterest);
    }
}
