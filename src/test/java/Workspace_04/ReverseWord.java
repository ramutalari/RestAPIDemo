package Workspace_04;

public class ReverseWord {

    public static void main(String[] args) {

        String str = "This is Bangalore";
        String revString = "";
        String Words[] = str.split(" ");


        for (int i =0;i<Words.length;i++)
        {
            String word = Words[i];
            String revWord = "";
            for (int j = word.length()-1;j>=0;j--)
            {
                revWord = revWord + word.charAt(j);
            }
            revString = revString + revWord + " ";
        }
        System.out.println(str);
        System.out.println(revString);
    }
}
