package workspace_03;

import java.util.Scanner;

public class Polindrome {

    public static void main(String[] args) {

        System.out.println("Enter number or string");
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String rev ="";

        for (int i = str.length()-1;i>=0;i--) {
            rev = rev + str.charAt(i);
        }
            if (rev.equals(str))
            {
                System.out.println("Given string or number is polindrome");
            }
            else
            {
                System.out.println("Given string is not polindrome");
            }
    }
}
