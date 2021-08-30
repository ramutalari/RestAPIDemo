package Workspace_02;

import java.util.ArrayList;
import java.util.List;

public class ReversePath {

    static String reversePath(String path) {
        //String[] words = path.split(" ");
        char[] pathChar = path.toCharArray();

        String result = "";
        String wordReverse = "";

        List<String> revList = new ArrayList<String>();
        for (int i = pathChar.length - 1; i >= 0; i--) {
            //wordReverse = words[i]+wordReverse;
            wordReverse = pathChar[i] + wordReverse;

            if (String.valueOf(pathChar[i]).equals("\\")
                    || String.valueOf(pathChar[i]).equals("/") ||String.valueOf(pathChar[i]).equals(":") || i == 0){

                result = result + wordReverse;

                //System.out.println(result);
                wordReverse = "";
            }
        }
        return result;
    }
    public static void main(String[] args) {

        // Objective:        //
        // Implement the missing "reversePath" function as used below.        //
        // This should produce the following example output
        // when the program is executed:        //
        // Path:          C:\This\is\a\sample\path\\to\a\file.txt
        // Path Reversed: file.txt\a\to\\path\sample\a\is\This\C:        //
        // Path:          //another/kind/of/path.txt
        // Path Reversed: path.txt/of/kind/another//        //
        final String[] paths = new String[]{
                "C:\\This\\is\\a\\sample\\path\\\\to\\a\\file.txt",
                "//another/kind/of/path.txt"};

        for (final String path : paths) {
            final String reversed = reversePath(path);
            System.out.println("Path:          " + path);
            System.out.println("Path Reversed: " + reversed);
        }
    }
}
