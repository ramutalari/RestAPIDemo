package Workspace_01;

import org.testng.annotations.Test;

public class FibonacciSeries {

    public static void main(String[] args) {

        int num = 8, a = 0, b = 0, c = 1;

        for (int i = 0; i < num; i++) {
            a = b;
            b = c;
            c = a + b;

            System.out.print(a + " ");
        }
    }
}
