public class Example005 {

    public static void main(String[] args) throws Exception{

        String str = "This is Ramu Talari";
        //int len= str.length();
        String revString = "";
        String words[] = str.split(" ");
        for (int i=0;i<words.length;i++)
        {
           // Character word = words[i];
           // String abc = words[i];
            String word = words[i];
            String revWord = "";
            for (int j=word.length()-1;j>=0;j--)
            {
                revWord = revWord +word.charAt(j);
            }
            revString = revString + revWord + " ";
            //System.out.println(revWord);
        }

        System.out.println(str);
       System.out.print(revString);
    }
}
