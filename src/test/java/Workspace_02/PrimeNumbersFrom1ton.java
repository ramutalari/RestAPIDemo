package Workspace_02;

import java.util.Scanner;

public class PrimeNumbersFrom1ton {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int i=0;
        int num = 0;
        String primeNumbers = "";

        for (i=1;i<=n;i++)
        {
            int counter = 0 ;
            for (num=i;num>=1;num--)
            {
                if (i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter==2)
            {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println(primeNumbers);
    }
}
