package Workspace_01;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int temp;
        int count = 0;

        System.out.println("Enter any number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i <= number ; i++) {
            temp = number % i;
            if (temp == 0) {
                count = count+1;
            }
        }
        if (count==2)
        {
            System.out.println("prime number");
        }
        else
        {
            System.out.println("Not a prime number");
        }
    }
}






