package Workspace_01;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {

        System.out.println("Enter Number or String");
        Scanner scanner = new Scanner(System.in);
        String str  = scanner.nextLine();
        String rev = "";

        for (int i = str.length()-1;i>=0;i--)
        {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev))
        {
            System.out.println("Given number or string is polindrome");
        }
        else
        {
            System.out.println("Not polindrome");
        }
    }
}
