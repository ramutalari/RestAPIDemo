package workspace_03;

import java.util.Scanner;

public class FindZeros {

    public static void main(String[] args) {
        System.out.println("Enter last number");

        Scanner scanner = new Scanner(System.in);
        int lastNum = scanner.nextInt();

        int count=1,j;

        if (lastNum<=9)
        {
            System.out.println(0);
        }
        else if (lastNum ==10)
        {
            System.out.println(count);
        }
        else
        {
            for (int i=11;i<=lastNum;i++)
            {
                j=i;
                while (j>0)
                {
                    if (j%10==0)
                        count++;
                    j=j/10;
                }

            }
            System.out.println(count);
        }
    }

}
