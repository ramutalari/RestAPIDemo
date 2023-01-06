package Workspace_04;

public class VowelsCount {

    public static void main(String[] args) {

        String str = "Hello ramu";
        str = str.toLowerCase();
        int vCount =0, cCount=0;

        for (int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                vCount++;
            }
            else if (ch>='a' && ch<='z')
            {
                cCount++;
            }
        }
        System.out.println(vCount);
        System.out.println(cCount);


    }

}
