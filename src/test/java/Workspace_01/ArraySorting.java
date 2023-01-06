package Workspace_01;

public class ArraySorting {

    public static void main(String[] args) {

        int arr[] = {1,5,2,3,0,0,5,1,7,9,0,0,0};

        int temp = 0;

        for (int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("After sorting elements are");

        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
