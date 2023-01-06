package workspace_03;

public class CountChar005 {


    public static void countEachChar(String str)
    {
        int counter[] = new int[256];
        int len = str.length();

        for (int i=0;i<len;i++)
         counter[str.charAt(i)]++;

        char arr[] = new char[str.length()];
        for (int i=0;i<len;i++) {
            arr[i]=str.charAt(i);
            int flag = 0;
            for (int j = 0; j <= i; j++) {
                if (arr[i] == arr[j]) {
                    flag++;
                }
            }
            if (flag ==1)
            {
                System.out.println(str.charAt(i)+" "+counter[str.charAt(i)]);
            }
        }

    }

    public static void main(String[] args) {

        String str = "Bangalore";
        countEachChar(str);

    }
}
