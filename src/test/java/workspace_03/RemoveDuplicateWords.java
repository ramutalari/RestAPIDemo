package workspace_03;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicateWords {

    public static void main(String[] args) {

        String str = "I am from am I Bangalore from I am I";

       // String str1[] = str.split("\\s+");

       str = Arrays.stream(str.split("\\s+")).distinct().collect(Collectors.joining(" "));

        System.out.println(str);
    }

}
