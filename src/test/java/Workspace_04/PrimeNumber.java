package Workspace_04;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println("Enter any number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int temp;
        Boolean isPrime  = true;

        for (int i =2;i<=num/2;i++)
        {
            temp = num%i;
            if (temp==0)
            {
                isPrime = false;
            }
        }
        if (isPrime)
        {
            System.out.println(num + " is prime");
        }
        else
        {
            System.out.println(num + " is not prime");
        }
    }
}
