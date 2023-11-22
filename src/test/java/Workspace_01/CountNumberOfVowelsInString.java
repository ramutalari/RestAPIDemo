package Workspace_01;

public class CountNumberOfVowelsInString {

    public static void main(String[] args) {
         //Declare a string
        String str = "This is a really simple sentence";

        //Converting entire string to lower case to reduce the comparisons
        str = str.toLowerCase();

        //To remove the space between words in the given string
        str = str.replaceAll("\\s", "");

        //Counter variable to store the count of vowels and consonant
        int vCount = 0, cCount = 0;

        for(int i = 0; i < str.length(); i++) {
            //Checks whether a character is a vowel
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                //Increments the vowel counter
                vCount++;
            }

            //Checks whether a character is a consonant
            else if(str.charAt(i) > 'a' && str.charAt(i)<='z') {
                //Increments the consonant counter
                cCount++;
            }
        }
        System.out.println("Number of vowels: " + vCount);
        System.out.println("Number of consonants: " + cCount);
    }
}
