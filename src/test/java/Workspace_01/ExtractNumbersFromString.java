package Workspace_01;

import java.util.Scanner;

public class ExtractNumbersFromString {

    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        System.out.println("Following integers found in the string: ");

        for (char ch:inputString.toCharArray())
        {
            if (Character.isDigit(ch))
            {
                System.out.print(ch+" ");
            }
        }
    }
}
