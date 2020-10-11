package ProgramsImp;

public class StringReverse {


    public static void main(String[] args) {

        //Approch 1- By uisng StringBuilder
        String str = "RAMU";
        StringBuilder sb = new StringBuilder(str);

        sb = sb.reverse();
        System.out.println(sb);

        //Approch 2 - Converting String to character array

        String str2 = "SAFE";
        char arr [] = str2.toCharArray();

        for (int i=str2.length()-1;i>=0;i--)
        {
            System.out.print(arr[i]);
        }

    }

}
