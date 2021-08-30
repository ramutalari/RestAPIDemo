package Workspace_01;

public class FindDuplicateChar {

    public static void main(String[] args) {

        String str = "beatifulbeach";

        char arr[] = str.toCharArray();
        System.out.println("Duplicate charcters in the string "+ str + ":");

        for (int i=0;i<str.length();i++)
        {
            for (int j=i+1;j<str.length();j++)
            {
                if (arr[i]==arr[j])
                {
                    System.out.println(arr[j]+" ");
                    break;
                }
            }
        }
    }

}
