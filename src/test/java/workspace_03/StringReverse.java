package workspace_03;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        System.out.println("Enter string");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String rev = "";

        for (int i=str.length()-1;i>=0;i--)
        {
            rev = rev +str.charAt(i);
        }
        System.out.print(rev);
        if (rev.equals(str))
        {
            System.out.println("polidrome");
        }

    }
}
