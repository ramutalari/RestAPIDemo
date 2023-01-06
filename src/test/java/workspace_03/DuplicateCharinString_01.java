package workspace_03;

public class DuplicateCharinString_01 {

    public static void main(String[] args) {
        String str = "beautiful beach";

        char arr[] = str.toCharArray();

        for (int i=0;i<str.length();i++)
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
