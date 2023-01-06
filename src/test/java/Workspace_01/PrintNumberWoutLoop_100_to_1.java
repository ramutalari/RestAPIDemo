package Workspace_01;

public class PrintNumberWoutLoop_100_to_1 {

    public static void main(String[] args) {

        int num = 100;
        printNumbers(num);
    }

    public static void printNumbers(int number)
    {
        if (number>0)
        {
            System.out.print(number+" ");
            printNumbers(number-1);
        }
    }
}
