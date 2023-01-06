public class Test01 {

    public static void main(String[] args) {

        int num[] = {1,2,3,4,5,6,7,8,9,10};

        int len = num.length;


        for (int i =0;i<len;i++)
        {
            for (int j=num.length-1;j>=0;j--)
            {

                if(num[i]+num[j] == 11)
                {
                    System.out.println(num[i]+" and "+num[j] + " sum is 11");
                }
                /*else
                {
                    System.out.println("Sum is not equal to 11");
                }*/
            }

        }


        /*String str = "A2bc3d4e";

        //AAbcbcbcdddde

        int len = str.length();

        for (int i=0;i<len;i++)
        {
            char ch = str.charAt(i);
            if (str.contains("2") && ch=='A')
            {
                System.out.print("A");
            }
        }
*/

    }

}
