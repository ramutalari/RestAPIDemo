package Workspace_01;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicateWords_02 {

    public static void main(String[] args) {

        String str = "I am working as a project a working as lead a I project project lead";

       // char aa[] = str.toLowerCase().toCharArray();

        str = Arrays.stream(str.split("\\s+")).distinct().collect(Collectors.joining(" "));

        System.out.println(str);
    }
}
