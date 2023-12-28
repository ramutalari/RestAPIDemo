package programs_imp;

import java.util.Arrays;

public class LargestTwoNumsInArray {

    public static void main(String[] args){
        int arr[] = {10,5,4,22,30,14,18,45,66,66,2,100,80,32,80, 11};

        int larget = 0;
        int secondLargest = 0;

        Arrays.sort(arr);
        System.out.print("The given array is: ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ "\t");
        }
        for (int i=0;i<arr.length;i++){
            if (arr[i] > larget){
                secondLargest = larget;
                larget = arr[i];
            }
        }
        System.out.println();
        System.out.println("largest number is: "+larget);
        System.out.println("second largest number is: "+secondLargest);
    }
}
