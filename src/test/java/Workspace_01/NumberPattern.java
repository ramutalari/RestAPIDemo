package Workspace_01;

public class NumberPattern {
    public static void main(String[] args) {
        int i,j,row=4;
        int number;
        for (i=1;i<=row;i++)
        {
            number =1;
            for (j=1;j<=i;j++)
            {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
