package Workspace_04;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,2,40,3,40,50,60,78,90,115,203};
        //Arrays.sort(arr);
        Arrays.toString(arr);
        int key = 40;
        boolean status = false;

        int l = 0;
        int h = arr.length-1;

        while (l<=h)
        {
            int mid = (l+h)/2;
            if (key==arr[mid])
            {
                status = true;
                System.out.println("Element found..");
                break;
            }

            if (key<arr[mid])
            {
                h = mid - 1;
            }

            if (key > arr[mid])
            {
                l = mid+1;
            }
        }
        if (status==false)
        {
            System.out.println("Element not found..");
        }
    }
}
