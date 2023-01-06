package Workspace_04;

public class FindNumberOfZeros {

    public static void main(String[] args) {

        int num = 100;
        int count =1,k;

        if (num<10)
        {
            System.out.println(0);
        }
        else if (num==10)
        {
            System.out.println(count);
        }
        else
        {
            for (int i=11;i<=num;i++)
            {
                k=i;
                while (k>0)
                {
                    if (k%i==0)
                        count++;
                    k=k/10;
                }
            }
            System.out.println(count);
        }
    }
}
