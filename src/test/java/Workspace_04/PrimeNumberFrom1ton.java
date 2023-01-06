package Workspace_04;

import java.util.Scanner;

public class PrimeNumberFrom1ton {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        int n = scanner.nextInt();

        int num = 0;
        String primeNumbers = "";

        for (int i=1;i<=n;i++)
        {
            //num = i;
            int count = 0;
            for (num=i;num>=1;num--)
            {
                if (i%num==0)
                {
                    count = count + 1;
                }
            }
            if (count==2)
            {
                primeNumbers = primeNumbers + i+" ";
            }
        }
        System.out.println("Prime Numbers are:"+primeNumbers);
    }
}
