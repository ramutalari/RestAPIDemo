package Workspace_01;

import java.util.Arrays;

public class AnagramProg {

    static void isAnagram(String str1, String str2)
    {
         String s1 = str1.replaceAll("\\s","");
         String s2 = str2.replaceAll("\\s","");

         boolean status = true;

        if (s1.length()!=s2.length())
        {
            status = false;
        }
        else {

            char arr1[] = s1.toLowerCase().toCharArray();
            char arr2[] = s2.toLowerCase().toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            status = Arrays.equals(arr1,arr2);
        }
        if(status)
        {
            System.out.println(s1.toLowerCase() + " and "+ s2.toLowerCase() + " are ANAGRAM");
        }
        else
        {
            System.out.println(s1.toLowerCase() + " and "+ s2.toLowerCase() + " are NOT ANAGRAM");
        }
    }
    public static void main(String[] args) {

        isAnagram("LISTen", "Si le nt");
        isAnagram("Pune", "Persistent");
        isAnagram("Mother in law", "Hitler Woman");
    }
}
