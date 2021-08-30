package Workspace_02;

public class Polindrome_Ex_2 {

    public static void main(String[] args) {

        int n = 454;
        int r, sum = 0,temp;
        temp = n;

        while (n>0)
        {
            r = n%10;
            sum = (sum*10)+r;
            n = n/10;
        }

        if(temp==sum)
            System.out.println("The given number is polindrome");
        else
            System.out.println("The given number is not polindrome");
    }
}
