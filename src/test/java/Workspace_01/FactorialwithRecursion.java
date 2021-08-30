package Workspace_01;

public class FactorialwithRecursion {

    public static int factorial(int n){

        if (n==1)
        {
           // System.out.println("Factorial of ("+ n +") = 1");
            return n;
        }
        else
        {
            //System.out.println("Factorial of ("+ n + ") = " + n +" * factorial( "+ (n-1) +")");
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {

        
        System.out.println(factorial(5));
    }
}
