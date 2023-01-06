package workspace_03;

public class StringRev005 {

    public static void main(String[] args) {

        //1
        String str ="aba";
        String rev = "";

        for (int i=str.length()-1;i>=0;i--)
        {
            rev = rev + str.charAt(i);
        }
        System.out.print(rev);
        System.out.println();
        if (rev.equals(str))
        {
            System.out.println("Polindrome");
        }
        else
        {
            System.out.println("Not polindrome");
        }


        //2
        /*String str = "ramu";
        String token[] = str.split("");

        for (int i = token.length-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
        }
*/

        //3
        /*String str = "jkl";
        char arr[] = str.toCharArray();
        for (int i = str.length()-1;i>=0;i--)
        {
            System.out.print(arr[i]);
        }*/

    }
}
