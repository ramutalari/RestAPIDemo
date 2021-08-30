package Workspace_01;

public class RecursionExample {

    public static int factorial(int n)
    {
        if (n==1)
        {
            return n;
        }
        else
        {
            return n*factorial(n-1);
            //System.out.println(factor);
        }
    }

    public static void main(String[] args) {

        System.out.println("Factorial of "+ 5 + " is "+factorial(5));


    }
}
