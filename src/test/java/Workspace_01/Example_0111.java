package Workspace_01;

public class Example_0111 {

    public static void main(String[] args) {

        int arr[] = {0,1,1,0,1};

        int len = arr.length;

        for (int i=0;i<len;i++)  //0
        {
            for (int j=i+1;j<len;j++) //1 1
            {
                if (arr[i]<arr[j]) //0 0
                {
                    System.out.println(arr[i]);
                    break;

                }
            }
        }

    }

}

