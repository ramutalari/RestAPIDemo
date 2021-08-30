package Workspace_01;

public class OccuranceOfChars {

    static void countEachChar(String s)
    {
        int counter[] = new int[256];

        int len = s.length();

        for (int i=0;i<len;i++)
        counter[s.charAt(i)]++;

        char arr[] = new char[s.length()];

        for (int i=0;i<len;i++)
        {
            arr[i] = s.charAt(i);
            int flag = 0;
            for (int j=0;j<=i;j++)
            {
                if (s.charAt(i)==arr[j])
                    flag++;
            }
            if (flag == 1)
                System.out.println("Occurrence of char " + s.charAt(i)
                        + " in the String is:" + counter[s.charAt(i)]);

        }

    }



    public static void main(String[] args) {

        String str = "Anantapur";
        countEachChar(str);

    }

}
