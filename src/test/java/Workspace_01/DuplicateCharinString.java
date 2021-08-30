package Workspace_01;

public class DuplicateCharinString {

    public static void main(String[] args) {

        String str = "beautiful beach";

        char arr[] = str.toCharArray();
        System.out.println("Duplicate characters in the string "+ str +  " are: ");
        for (int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if (arr[i]==arr[j])
                {
                    System.out.println(arr[j]+ " ");
                    break;
                }
            }
        }
    }
}
