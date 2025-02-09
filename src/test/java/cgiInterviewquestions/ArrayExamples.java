package cgiInterviewquestions;

import java.util.Scanner;

//Write a Java program to find the largest element in an array.
//Write a Java program to remove duplicates from an array.
//Write a Java program to find the intersection of two arrays.
public class ArrayExamples {
    public static void main(String[] args) {
        largestElementArray();
        // removeDuplicateFromArray();
        //intersectionofTwoArray();
    }

    public static void largestElementArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        //Enter the data int the array
        System.out.println("Enter the array element");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();

        }
        //loop to display the array element

        System.out.println("the enterd array elements are ");
        for(int i =0;i<size;i++)
        {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        //find the largets number
        int largest = arr1[0];
        for (int i = 0; i < size; i++) {
            if (arr1[i] > largest) {
                largest = arr1[i];
            }


        }
        System.out.println("largest number in this array is " + largest);
    }
}
