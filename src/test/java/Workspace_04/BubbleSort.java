package Workspace_04;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        //int arr[] = {1,5,2,9,201,541,110,45,52,60,9,1,2};
       // int key = 45;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int num = scanner.nextInt();

        int arr[] = new int[num];

        System.out.println("Enter "+num + " Elements");
        for (int i=0;i<num;i++)
        {
            arr[i] = scanner.nextInt();
        }



        System.out.println("Array before sorting: "+ Arrays.toString(arr));

        for (int i=0;i<arr.length-1;i++)
        {
            for (int j=0;j<arr.length-1;j++)
            {
                if (arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Array after sorting: "+ Arrays.toString(arr));
    }
}
