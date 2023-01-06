package Workspace_02;

public class ReverseWords {

    public static void main(String[] args) {

        String str = "Aadhya welcome to home";
        String revString = "";

        String words[] = str.split(" ");
        for (int i=0;i<words.length;i++)
        {
            String word = words[i];
            String revWords = "";

            for (int j=word.length()-1;j>=0;j--)
            {
                revWords = revWords + word.charAt(j);
            }
            revString = revString + revWords + " ";
        }
        System.out.println(str);
        System.out.println(revString);
    }
}
