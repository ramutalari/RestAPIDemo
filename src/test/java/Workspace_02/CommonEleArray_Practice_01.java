package Workspace_02;

public class CommonEleArray_Practice_01 {

    public static void main(String[] args) {


        int arr1[] = {2, 33, 43, 12, 99, 0};
        int arr2[] = {33, 35, 2, 9, 89, 99};

        System.out.println("Common elements in array are: ");

        for (int i = 0; i < arr1.length;i++)
        {
            for (int j=0;j<arr2.length;j++)
            {
                if (arr1[i]==arr2[j])
                {
                    System.out.println(+arr1[i]);
                    break;
                }
            }
        }
    }
}
