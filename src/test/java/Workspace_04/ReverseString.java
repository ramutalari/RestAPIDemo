package Workspace_04;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Bangalore";
        /*char ch[] = str.toCharArray();

        for (int i=ch.length-1;i>=0;i--)
        {
            System.out.print(ch[i]);
        }*/

        /*String token[] = str.split("");
        for (int i=token.length-1;i>=0;i--)
        {
            System.out.print(token[i]);
        }*/

        String rev = "";
        for (int i=str.length()-1;i>=0;i--)
        {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }
}
