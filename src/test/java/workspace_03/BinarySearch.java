package workspace_03;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,101,205,304,45,568,687};

        Arrays.sort(arr);

        int lowValue = 0;
        int highValue = arr.length-1;
        boolean status = false;

        int key = 205;

        while (lowValue<=highValue) {
            int mid = (lowValue + highValue)/2;
            if (key == arr[mid]) {
                System.out.println("Element found..");
                status = true;
                break;
            }
            if (key < arr[mid]) {
                highValue = mid - 1;
            }
            if (key > arr[mid]) {
                lowValue = mid + 1;
            }
        }
        if (status==false) {
            System.out.println("Element not found..");
        }
    }
}
