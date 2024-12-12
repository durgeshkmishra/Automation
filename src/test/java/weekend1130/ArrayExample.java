import java.util.*;

public class ArrayExample {
    public static void main(String[] args) {
        //array example
       int[] age = {10,20,30,40};
        //print each element using for loop
        for (int i = 0;i<age.length;i++){
            System.out.println(age[i]);


                   }
        //print array element without loop

      System.out.println(Arrays.toString(age));
        //Java method with parameter
        arraysInput("durgesh",45);
        arraysInput("Harshini",36);


    }
    //enter the array value through input--java method
    public static void arraysInput(String fname, int age) {
        //Scanner input = new Scanner(System.in);
        //System.out.println("I am going to enter the Array element");
        System.out.println(fname +" is "+ age);
        checkAge(age);
    }
    //check the age and provide access
    public static void checkAge(int age) {
        if (age >18){
            System.out.println("Access granted");}
            else{
            System.out.println("Access Restricted");
        }

    }
    }

