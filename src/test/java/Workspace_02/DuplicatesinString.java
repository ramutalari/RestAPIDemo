package Workspace_02;

public class DuplicatesinString {

    public static void main(String[] args) {

        String str = "RamuTalari";
        char arr[] = str.toLowerCase().toCharArray();

        System.out.println("Duplicate strings are:");
        for(int i=0;i<str.length();i++)
        {
            for (int j=i+1;j<str.length();j++)
            {
                if (arr[i]==arr[j])
                {
                    System.out.println(arr[j]+"");
                    break;
                }
            }
        }
    }
}
