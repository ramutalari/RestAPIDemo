package Workspace_02;

public class SecondHighestNumInArray {

    public static void main(String[] args) {

        int arr[] = {10, 20,30,40, 35};

        int largest = 0;
        int secondLargest = 0;

        System.out.println("Given numbers are:");

        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }

        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]>largest)
            {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i]>secondLargest)
            {
                secondLargest = arr[i];
            }
        }
        System.out.println("\nSecond largest number is:" + secondLargest);
        System.out.println("Largest Number is: "  +largest);
    }
}
