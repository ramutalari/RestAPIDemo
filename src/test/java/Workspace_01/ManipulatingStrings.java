package Workspace_01;

import java.util.Arrays;

public class ManipulatingStrings {

    public static void main(String[] args) {
        String str = "Selenium";

        String splitArray[] = str.split("e");
        System.out.println(Arrays.toString(splitArray));

        String splitArray2[] = str.split("e",2);
        System.out.println(Arrays.toString(splitArray2));


    }
}
