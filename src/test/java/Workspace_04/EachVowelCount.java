package Workspace_04;

import com.sun.jdi.VMOutOfMemoryException;

public class EachVowelCount {
    public static void main(String[] args) {
        String str = "This is Bangalore";
        str = str.toLowerCase();

        int Vcount[] = new int[5];
        for (int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if (ch=='a')
            {
                Vcount[0]++;
            }
            else if (ch=='e')
            {
                Vcount[1]++;
            }
            else if (ch=='i')
            {
                Vcount[2]++;
            }
            else if (ch == 'o')
            {
                Vcount[3]++;
            }
            else if (ch=='u')
            {
                Vcount[4]++;
            }
        }
        System.out.println(Vcount[0]);
        System.out.println(Vcount[1]);
        System.out.println(Vcount[2]);
        System.out.println(Vcount[3]);
        System.out.println(Vcount[4]);

    }
}
