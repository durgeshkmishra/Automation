package arrayPractise;

import java.util.Arrays;

public class FirstP {
    static int[] arr1 = {1, 2, 3, 4};//declare a array
    // String arr2[] = {'ram', 'shyam'};
    static int a1[] = new int[5];

    public static void main(String[] args) {
       // System.out.println(Arrays.toString(arr1));
        //System.out.println(Arrays.toString(a1));

    int [] a2 = new int[10];
    Arrays.fill(a2,10); // assign value to array
        int []a3 = Arrays.copyOf(a2,20);
        System.out.println(Arrays.toString(a2));// to string used to print the value of a array
        System.out.println(Arrays.toString(a3));
        Arrays.fill(a3,10,20,20);
        System.out.println(Arrays.toString(a3));

        String d2 = "Sample test Data";
        char e2[] = d2.toCharArray(); // break string into a char
        System.out.println(Arrays.toString(e2));
        System.out.println(e2.length);
// count the number of charactwer in a given name
        //
        String d3 = "Durgesh Kumar Mishra";
        char []e4 = d3.toCharArray();
        System.out.println("Total  no of character in a given name is - " + e4.length);

        //.Split

       String []d4 = d3.split(" ");
        System.out.println(Arrays.toString(d4));

//        //for each
//        for (type variable : arrayname) {
//  ...
//        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
//            //print the array element through array
//            for (int j = 0; j< cars.length;j++)
//            {
//                System.out.println(cars[j]);
//
//            }
        }
    }
//}