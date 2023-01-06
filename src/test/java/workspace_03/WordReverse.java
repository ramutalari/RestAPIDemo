package workspace_03;

public class WordReverse {
    public static void main(String[] args) {

        String str = "Welcome to India";
        String revString = "";

        String[] words = str.split(" ");
        for (int i=0;i<words.length;i++)
        {
            String word = words[i];
            String revWord ="";

            for (int j=word.length()-1;j>=0;j--) {
                revWord = revWord + word.charAt(j);
            }
            revString = revString + revWord + " ";
        }
        System.out.println(str);
        System.out.println(revString);
        }
    }
