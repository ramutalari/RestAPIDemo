package Workspace_01;

import java.util.Scanner;

public class ReverseNumberExample {

    public static void main(String[] args) {

        System.out.println("Enter any number: ");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int rev = 0 ;
        int remainder = 0;

        do {
            remainder = num % 10;
            rev = rev * 10 + remainder;
            num = num / 10;

        }while (num>0);

        System.out.println(rev);
    }

}
