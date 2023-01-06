package workspace_03;

public class DuplicateCharsString {

    public static void main(String[] args) {

        //String str = "beautiful beach";

        String str = "BEautifUl BeA  Ch";

       String s1= str.replaceAll("\\s","");

        char arr [] =s1.toLowerCase().toCharArray();

        //char arr[] = str.toCharArray();
        System.out.println("Duplicate characters in "+s1.toLowerCase() +" are: ");
        for (int i=0;i<s1.length();i++)
        {
            for (int j=i+1;j<s1.length();j++)
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
