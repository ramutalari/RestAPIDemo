package Workspace_01;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSorting {

    public static void main(String[] args) {

        int arr[] = {21,42,01,32,5};
        int n = arr.length;

        System.out.println("Array before sorting: "+ Arrays.toString(arr));

        for (int i=0;i<n-1;i++) // Number of passes
        {
            for (int j=0;j<n-1;j++)  //Iteration in each pass
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Array after sorting: "+ Arrays.toString(arr));
    }
}
