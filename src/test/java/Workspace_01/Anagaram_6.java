package Workspace_01;

import java.util.Arrays;

public class Anagaram_6 {

    static void isAnagram(String s1, String s2)
    {
        String str1 = s1.replaceAll("\\s","");
        String str2 = s2.replaceAll("\\s","");

        boolean status = true;

        if (str1.length()!=str2.length())
        {
            status = false;
        }
        else
        {
            char arr1[] = str1.toLowerCase().toCharArray();
            char arr2[] = str2.toLowerCase().toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            Arrays.equals(arr1,arr2);
        }
        if (status)
        {
            System.out.println(str1.toLowerCase()+" and "+str2.toLowerCase()+ " are ANAGRAM ");
        }
        else
        {
            System.out.println(str1.toLowerCase()+" and "+str2.toLowerCase()+ " are NOT ANAGRAM ");
        }
    }

    public static void main(String[] args) {
        isAnagram("Li  s  t E    N", "S   I   L E n  t");
    }

}
