package steps;


import java.sql.Array;

public class ReverseString {

    public static void main(String[] args)
    {
        String str1 = "SMART TEAM, SMART RESULTS";

        StringBuilder str2 = new StringBuilder(str1);
        //str2.append(str1);
        //str2.reverse();
        str2 = str2.reverse();
        System.out.println(str2);
    }
}
