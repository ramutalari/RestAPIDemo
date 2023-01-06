package workspace_03;

public class CountEachChar {

    static void countChar(String str){
        int counter[] = new int[256];
        int len = str.length();

        for (int i=0;i<len;i++)
            counter[str.charAt(i)]++;

        char arr[] = new char[str.length()];
        for (int i=0;i<len;i++)
        {
            arr[i]=str.charAt(i);
            int flag = 0;

            for (int j=0;j<=i;j++) {
                if (str.charAt(i) == arr[j])
                    flag++;
            }
            if (flag==1)
                System.out.println("Occurance of char "+str.charAt(i)+" in the string are: "+counter[str.charAt(i)]);
        }
    }
    public static void main(String[] args) {
        String str = "indiaBengaluru";
        countChar(str);
    }
}
