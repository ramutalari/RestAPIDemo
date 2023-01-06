package Workspace_04;

import java.util.Scanner;

public class BinarySeach_ex2 {

    public static void main(String[] args) {

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
                status= true;
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

}
