package Workspace_01;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicateWords {

    public static void main(String[] args) {

        String str = "I am from am I Bangalore am I from Bangalore";

        str = Arrays.stream(str.split("\\s+")).distinct().collect(Collectors.joining(" "));

        System.out.println(str);
    }

}
