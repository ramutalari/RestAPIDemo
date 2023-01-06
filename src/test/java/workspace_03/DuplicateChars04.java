package workspace_03;

public class DuplicateChars04 {

    public static void main(String[] args) {
        String str = "beatiFUL BeaCH";
        char arr1[] = str.toLowerCase().toCharArray();
        for (int i=0;i<str.length();i++)
        {
            for (int j=i+1;j<str.length();j++)
            {
                if (arr1[i]==arr1[j])
                {
                    System.out.println(arr1[j]);
                    break;
                }
            }
        }
    }
}
