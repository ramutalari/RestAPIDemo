package Workspace_02;

import java.util.Scanner;

public class CountEvenOddDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = scanner.nextInt();

        int even_count = 0;
        int odd_count = 0;

        while (num>0)
        {
            int rem = num%10;
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
        System.out.println("even count is: "+even_count);
        System.out.println("odd count is "+odd_count);

    }

}
