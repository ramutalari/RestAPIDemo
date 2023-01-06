package Workspace_01;

public class OccuranceOfVowelsInString {

    public static void main(String[] args) {

        String str = "Bangalore city is in India";

        str = str.toLowerCase();

        int vCount[] = new int[5];

        for (int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if (ch == 'a')
            {
                vCount[0]++;
            }
            else if (ch=='e')
            {
                vCount[1]++;
            }
            else if (ch=='i')
            {
                vCount[2]++;
            }
            else if (ch=='o')
            {
                vCount[3]++;
            }
            else if (ch=='u')
            {
                vCount[4]++;
            }
        }
        System.out.println("Number of 'a' = " + vCount[0]);
        System.out.println("Number of 'e' = " + vCount[1]);
        System.out.println("Number of 'i' = " + vCount[2]);
        System.out.println("Number of 'o' = " + vCount[3]);
        System.out.println("Number of 'u' = " + vCount[4]);
    }
}
