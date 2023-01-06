package workspace_03;

public class LinearSearch {

    public static void main(String[] args) {

        int arr[] ={1,20,5,3,6,9,4,7,8};
        int key = 205;
        boolean status = false;

        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]==key)
            {
                status = true;
                System.out.println("Element found at.. "+i);
                break;
            }
        }
        if (status==false)
        {
            System.out.println("Element not found..");
        }

    }
}
