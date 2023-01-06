package Workspace_02;

import java.util.Scanner;

public class FindZeros {

    public static void main(String[] args) {

        System.out.println("Enter last number");
        Scanner scanner = new Scanner(System.in);
        int lastNum = scanner.nextInt();

        int count=1,k;
        if (lastNum<=9)
        {
            System.out.println(0);
        }
        else if (lastNum==10)
        {
            System.out.println(count);
        }
        else
        {
            for (int i=11;i<=lastNum;i++)
            {
                k=i;
                while (k>0)
                {
                    if (k%10==0)
                        count++;
                        k=k/10;
                }
            }
            System.out.println(count);
        }
    }
}
