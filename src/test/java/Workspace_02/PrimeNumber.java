package Workspace_02;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int temp;
        boolean isprime = true;

        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i=2;i<=num/2;i++)
        {
            temp = num%i;
            if (temp==0)
            {
                isprime = false;
            }
        }
        if (isprime)
        {
            System.out.println(num+" number is prime");
        }
        else {
            System.out.println(num + " number is not prime");
        }
    }
}
