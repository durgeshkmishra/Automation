package arrayPractise;

import java.util.Arrays;

public class ExcerciseOneDarray {
    public static void main(String[] args) {
//        int arr1[] = {1,2,3,4};
//                int arr2[] = arr1;
//        System.out.println(Arrays.toString(arr2));
//        //assign the vaue to array
//        for (int i = 0;i<arr1.length;i++){
//            arr1[i]= 100-i*5;
//        }
//        System.out.println(Arrays.toString(arr1));
//        Arrays.sort(arr1);
//        System.out.println(Arrays.toString(arr1));
//        //print smallest array element
//        System.out.println(arr1[0]);
//        //print largestr number
//        System.out.println(arr1[arr1.length-1]);
        //write a code to get the 2nd highest no of a array
        int arr2[] = {-3,6,10,4,90,0};
        //using array fumction
//        Arrays.sort(arr2);
       System.out.println(Arrays.toString(arr2));
//        int j = arr2.length;
//        System.out.println(+j);
//        System.out.println(" highest number is - " +arr2[j-1]);
//        System.out.println("2nd highest number is - " +arr2[j-2]);

//using for loop
//        int maxNo = 0;
//        for (int i = 0 ; i< arr2.length ; i++)
//        {
//
//            if (maxNo < arr2[i]){
//                maxNo = arr2[i];
//            }
//        }
//        System.out.println("Higesht number of the array is - " +maxNo);

        //Bubble sort
        //method to arrange the array in  asscending order

        int temp = 0;
        for (int i=0;i< arr2.length;i++){
            for(int j= i+1;j< arr2.length;j++ )
                if(arr2[i]>arr2[j])
                {
                    temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;

                }
        }

        System.out.println(Arrays.toString(arr2));
        bubblesort();

    }
    static void bubblesort()
    {
        int temp = 0;
        int arr3 []= {10,1,4,5,100};
        for (int i=0;i< arr3.length;i++){
            for(int j= i+1;j< arr3.length;j++ )
                if(arr3[i]>arr3[j])
                {
                    temp = arr3[i];
                    arr3[i] = arr3[j];
                    arr3[j] = temp;

                }
        }

        System.out.println(Arrays.toString(arr3));
    }
}

