package Workspace_01;

import java.util.Scanner;

public class ReverseaString {

    public static void main(String[] args) {
        //Method 1

       /* String str = "Aadhya";
        char ch[] = str.toCharArray();
        for (int i=ch.length-1;i>=0;i--)
        {
            System.out.print(ch[i]);
        }*/

        //Method - 2

       /* System.out.println("Enter String value to reverse");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String token[] = str.split("");
        for (int i=token.length-1;i>=0;i--)
        {
            System.out.print(token[i]);
        }*/

        //Method - 3
        System.out.println("Enter string to reverse");
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String reverse = "";
        for (int i=str.length()-1;i>=0;i--)
        {
            reverse = reverse + str.charAt(i);
        }
        System.out.print(reverse);
    }
}
