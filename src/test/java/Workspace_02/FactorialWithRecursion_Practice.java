package Workspace_02;

public class FactorialWithRecursion_Practice {

    static int factorial(int n)
    {
        if (n==1)
        {
            return n;

        }
        else {

             return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {

        System.out.println(factorial(5));

    }
}
