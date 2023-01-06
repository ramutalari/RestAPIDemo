package workspace_03;

public class CountEachChar_003 {

    public static void countEachChar(String s1){

        String str = s1.replaceAll("\\s","");
       // str = str.toLowerCase().toCharArray()

        int counter[] = new int[256];
        int len = str.length();

        for (int i=0;i<len;i++)
        counter[str.charAt(i)]++;

        char arr[] = new char[str.length()];
        //arr = str.toLowerCase().toCharArray();
        for (int i=0;i<len;i++)
        {
            arr[i] = str.charAt(i);
            int flag = 0;

            for (int j=0;j<=i;j++)
            {
                if (arr[i]==arr[j])
                    flag++;
            }
            if (flag==1)
                System.out.println("Occurance of each char "+str.charAt(i)+" count is: "+counter[str.charAt(i)]);
        }
    }

    public static void main(String[] args) {
        String str = "beginners b OO K";
        countEachChar(str);
    }
}
