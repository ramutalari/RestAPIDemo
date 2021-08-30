package Workspace_02;

import java.util.Scanner;

public class SwapByUsingThirdVar {

    public static void main(String[] args) {

        int x,y,temp;

        System.out.println("Enter x and y");

        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        y = s.nextInt();

        System.out.println("Before swapping:"+ "x: "+x +"y: "+y);

        temp = x;
        x = y;
        y=temp;

        System.out.println("After swapping:"+ "x: "+x +"y: "+y);
    }
}
