package Workspace_01;

public class LinearSearch {

    public static void main(String[] args) {

        //In Linear search we do search element through the array

        int arr[] = {20,38,50,67,90,100};
        int searchEle = 90;
        boolean status = false;

        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]==searchEle)
            {
                status = true;
                System.out.println("Element found at: "+i);
                break;
            }
        }

        if (status==false)
        {
            System.out.println("Element not found");
        }
    }
}
