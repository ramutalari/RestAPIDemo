package Workspace_01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.*;

public class SecondHighestNumInArray {

    public static void main(String[] args)
    {
        Integer array[] = {10, 20, 25, 63, 96, 57,96};
        int size = array.length;
        Arrays.sort(array);
        System.out.println("sorted Array ::"+Arrays.toString(array));
        int res = array[size-2];
        System.out.println("2nd largest element is ::"+res);

       // Integer arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 ,100};
       /* int largest = 0;
        int secondLargest = 0;

        System.out.println("The given array is:");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + "\t");
        }

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > largest)
            {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest)
            {
                secondLargest = arr[i];
            }
        }
        System.out.println("\nSecond largest number is:" + secondLargest);
        System.out.println("Largest Number is: "  +largest);*/
    }
}
