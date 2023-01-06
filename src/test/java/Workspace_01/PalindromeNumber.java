package Workspace_01;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = scanner.nextInt();

        int org_num = num;
        int rev  = 0;

        while (num>0)
        {
            int remainder = num%10;
            rev = rev*10+remainder;
            num = num/10;
        }
        System.out.println("Reverse number is: "+rev);

        if (org_num==rev)
        {
            System.out.println(org_num + " is palnidrome");
        }
        else
        {
            System.out.println(org_num+ " is not palindrome");
        }
    }
}
