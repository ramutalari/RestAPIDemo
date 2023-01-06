package Workspace_01;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        /*
          Refer this video to understand more on Binary search
          https://www.youtube.com/watch?v=Ze7Yecs49MA&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=21
         */
        int arr[] ={2,3,55,65,32,22};

       Arrays.sort(arr);

        int l = 0;
        int h = arr.length-1;
        int key = 32;
        boolean status = false;

        while (l<=h) {
            int mid = (l + h) / 2;

            if (key == arr[mid]) {
                System.out.println("Element found..");
                status = true;
                break;
            }
            else if (key < arr[mid]) {
                h = mid - 1;
            }
            else if (key > arr[mid]) {
                l = mid + 1;
            }
        }
            if (status==false)
            {
                System.out.println("Element not found..");
            }
        }
    }

/*

 System.out.println("Enter number of elements");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int arr[] = new int[num];

        System.out.println("Enter "+num +" elements");
        for (int i=0;i<num;i++)
            arr[i] = scanner.nextInt();

        System.out.println("Enter search value: ");
        int key = scanner.nextInt();

        int l =0;
        int h = arr.length-1;
        boolean status = false;

        while (l<=h)
        {
            int mid = (l+h)/2;
            if (key==arr[mid])
            {
                status  = true;
                System.out.println("Element found..");
                break;
            }
            else if (key <arr[mid])
            {
                h = mid-1;
            }
            else if (key > arr[mid])
            {
                l = mid+1;
            }
        }

        if (status == false)
        {
            System.out.println("Element not found..");
        }
    }
 */