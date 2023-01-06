package workspace_03;

import java.util.Scanner;

public class SwapwithThirdVar {

    public static void main(String[] args) {
        int x,y, temp;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter x and y values:");

        x = s.nextInt();
        y = s.nextInt();

        System.out.println("Before swapping: "+ "x:"+x+"y:"+y);

        temp =x;
        x=y;
        y=temp;

        System.out.println("Before swapping: "+ "x: "+x+"y: "+y);
    }
}
