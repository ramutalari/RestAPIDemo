package Workspace_01;

public class DuplicateCharacters_practice {

    public static void main(String[] args) {

        String str = "Beautiful Beach";

        char arr[] = str.toCharArray();

        System.out.println("Duplicate characters are :"+str);

        for (int i=0;i<str.length();i++)
        {
            for (int j=i+1;j<str.length();j++)
            {
                if (arr[i]==arr[j])
                {

                    System.out.println(arr[j]);
                    break;
                }
            }
        }

    }

}
