package workspace_03;

public class PrimeNumbersFrom1ton {

    public static void main(String[] args) {
        int number = 100;

        int i=0;
        int n=0;
        String PrimeNumbers = "";

        for (i=0;i<number;i++)
        {
            int counter =0;
            for (n=i;n>=1;n--)
            {
                if (i%n==0)
                {
                    counter = counter + 1 ;
                }
            }
            if (counter==2)
            {
                PrimeNumbers = PrimeNumbers + i+" ";
            }
        }
        System.out.println(PrimeNumbers);
    }
}
