package Workspace_01;

public class PrintNumberWoutLoop {

    public static void main(String[] args)
    {
        int number = 1;

        printNumbers(number);
    }

    public static void printNumbers(int num)
    {
        if(num <= 100)
        {
            System.out.print(num +" ");
            //num++;
            printNumbers(num + 1);
        }
    }
}
