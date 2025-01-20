package weekend1130;

public class CheckAge {
    static void checkAge(int age){
        //check age
        if (age >18){
            System.out.println("You are old enough to Enter in Bar");
        }else{
            System.out.println("You are not old enough to enter in BAR");
        }

    }

    public static void main(String[] args) {
        checkAge(20);
        int z = AddNumber(10,20);
        System.out.println(z);
    }
    static int AddNumber(int x, int y){
        return x+=y;

    }
}
