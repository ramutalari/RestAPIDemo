package Workspace_01;

import java.util.Scanner;

public class FindZeros {

    public static void main(String[] args) {

        System.out.println("Enter last number: ");
        Scanner scanner = new Scanner(System.in);
        int lastNumber = scanner.nextInt();

        int count = 1, k;
        if (lastNumber < 10)
            System.out.println("Number of zeros are: "+ 0);
        else if (lastNumber == 10)
            System.out.println(count);
        else {
            for (int i = 11; i <= lastNumber; i++) {
                k = i;
                while (k > 0) {
                    if (k % 10 == 0)
                        count++;
                    k = k / 10;
                }
            }
            System.out.println("Number of zeros from 1 to "+lastNumber + " are: " +count);
        }
    }
}



