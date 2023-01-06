package Workspace_02;

import java.util.Scanner;

public class ReverseAString_3Ways {

    public static void main(String[] args) {
        //Method 1
        /*String str = "iPhone";
        char[] arr = str.toCharArray();
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }*/

        //Method 2
        /*System.out.println("Enter String to reverse");

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String[] rev = str.split("");
        for (int i=str.length()-1;i>=0;i--)
        {
            System.out.print(rev[i]);
        }   */

        //Method - 3
        System.out.println("Enter String to reverse");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String rev = "";
        for (int i=str.length()-1;i>=0;i--)
        {
            rev = rev+str.charAt(i);
        }
        System.out.print(rev);



    }
}
