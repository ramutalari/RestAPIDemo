package workspace_03;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        int temp;
        boolean isPrime = true;

        System.out.println("Enter any number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i=2;i<=num/2;i++)
        {
            temp = num%i;
            if (temp==0)
            {
                isPrime = false;
            }
        }
        if (isPrime)
        {
            System.out.println("Number is Prime");
        }
        else
        {
            System.out.println("Number is not Prime");
        }
    }
}
