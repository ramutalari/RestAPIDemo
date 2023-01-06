package Workspace_02;

import java.util.Scanner;

public class ReverseString_0001 {

    public static void main(String[] args) {
        //Method 1
        /*String str = "India";
        char rev[] = str.toCharArray();

        for (int i=rev.length-1;i>=0;i--)
        {
            System.out.print(rev[i]);
        }*/

        //Method 2

        /*System.out.println("Enter String");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String rev[] = str.split("");
        for (int i = rev.length-1;i>=0;i--)
        {
            System.out.print(rev[i]);
        }*/

        //Method 3

        System.out.println("Enter String");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String rev = "";

        for (int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.print(rev);

    }
}
