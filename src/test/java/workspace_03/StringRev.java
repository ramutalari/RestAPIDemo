package workspace_03;

public class StringRev {

    public static void main(String[] args) {

        //1

        /*String str = "ramu";
        char ch[] = str.toCharArray();

        for (int i=str.length()-1;i>=0;i--)
        {
            System.out.print(ch[i]);
        }
        */

        //2

        /*String str = "cba";
        String token[] = str.split("");
        for (int i = token.length-1;i>=0;i--)
        {
            System.out.print(token[i]);
        }*/

        //3
        String str ="aba";
        String rev = "";
        for (int i=str.length()-1;i>=0;i--)
        {
            rev = rev+str.charAt(i);
        }
        System.out.print(rev);
        System.out.println();

        if (rev.equals(str))
        {
            System.out.println("polindrome");
        }
        else
        {
            System.out.println("Not Polindrome");
        }


    }

}
