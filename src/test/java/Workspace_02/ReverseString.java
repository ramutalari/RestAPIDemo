package Workspace_02;

public class ReverseString {

    public static void main(String[] args) {
        //approch 1
        String str = "ramu";
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

        //approch 2
        char arr[] = str.toCharArray();
        for (int i=str.length()-1;i>=0;i--)
        {
            System.out.print(arr[i]+"");
        }
    }
}



