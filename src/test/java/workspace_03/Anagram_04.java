package workspace_03;

import java.util.Arrays;

public class Anagram_04 {

     static void isAnagram(String str1, String str2){

         String s1 = str1.replaceAll("\\s","");
         String s2 = str2.replaceAll("\\s","");

         boolean status = true;

         if (s1.length()!=s2.length())
         {
             status = false;
         }
         else
         {
             char arr1[] = s1.toLowerCase().toCharArray();
             char arr2[] = s2.toLowerCase().toCharArray();

             Arrays.sort(arr1);
             Arrays.sort(arr2);

             status = Arrays.equals(arr1,arr2);

         }
         if (status)
             System.out.println("Str1 and Str2 are ANAGRAM");
         else
             System.out.println("Str1 and Str2 are NOT ANAGRAM");
    }
    public static void main(String[] args) {

        isAnagram("k  E   e  p","P    e   E   K");
    }
}
