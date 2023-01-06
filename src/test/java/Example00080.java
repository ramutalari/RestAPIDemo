public class Example00080 {

    public static void main(String[] args) {

        String str = "Ramu Talari";

        int counter[] = new int[256];

        for (int i=0;i<str.length();i++)
        {
            counter[str.charAt(i)]++;
        }

        char arr[] = new char[str.length()];
        for (int i=0;i<str.length();i++)
        {
            //int flag = 0;
            arr[i] = str.charAt(i);
            int count = 0;
            for (int j=0;j<=i;j++)
            {
                if (arr[i]==arr[j])
                {
                    count++;
                }
            }
            if (count==1)
            {
                System.out.println(str.charAt(i)+" "+counter[str.charAt(i)]);
            }
        }
           }

}
