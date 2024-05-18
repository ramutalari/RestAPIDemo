package Workspace_01;

public class NumberPattern_2 {

    public static void main(String[] args) {

        int i,j,k=1;
        int row=7;

        for (i=1;i<=row;i++)
        {
            for (j=1;j<i+1;j++)
            {
                System.out.print(k++ +" ");
            }
            System.out.println();
        }
    }
}
