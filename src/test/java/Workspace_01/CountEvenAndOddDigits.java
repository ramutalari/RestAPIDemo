package Workspace_01;

import java.util.Scanner;

public class CountEvenAndOddDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = scanner.nextInt();

        //int num=234657;
        int even_count = 0;
        int odd_count  = 0;

        while(num>0)
        {
            int rem = num %10;

            if (rem%2==0)
            {
                even_count++;
            }
            else
            {
                odd_count++;
            }
            num = num/10;
        }
        System.out.println("Even count is: "+even_count);
        System.out.println("Odd count is: "+odd_count);
    }
}
