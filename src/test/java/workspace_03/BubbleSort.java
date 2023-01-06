package workspace_03;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {20,1,54,36,24,4,8,94,14,05};

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
        System.out.println("Array after sorting: "+Arrays.toString(arr));


    }

}
