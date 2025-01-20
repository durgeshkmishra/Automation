package arrayPractise;

import java.util.Arrays;

public class LowestAge {
    public static void main(String[] args) {

        //list of the age
        int age[] = {10, 20, 30, 40, 50, 60};
        System.out.println(Arrays.toString(age));

        // write the logic to get the min age from this list
        int lowestAge = 0;
        for (int minAge: age) {
           // System.out.println(minage);
            if (lowestAge > minAge) {
                lowestAge = minAge;
            }

        }
     System.out.println("The lowest age of the arraylist is " + lowestAge);
  }
}

