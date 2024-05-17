package Workspace_01;

import java.util.HashSet;

public class RemoveDuplicateCharacters {

    public static String removeDuplicateChar(String str){

        StringBuilder result = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        for (int i=0;i<str.length();i++){
            char c = str.charAt(i);
            // Check if the character is not already in the set
            if (!set.contains(c)){
                // Append the character to the result
                result.append(c);
                // Add the character to the set
                set.add(c);
            }
        }
        // Convert the StringBuilder to a String and return it
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "heelloo";
        String res = removeDuplicateChar(str);
        System.out.println(res);


    }
}
