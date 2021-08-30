package Workspace_01;

import java.util.Scanner;

public class SwapStrings {

    public static void main(String[] args) {

        String str1 = "iphone", str2 = "miphone";

        System.out.println("Before swapping: "+ "str1: "+str1+" "+ "str2: "+ str2);

        str1 = str1+str2;
        str2 = str1.substring(0,(str1.length()-str2.length()));
        str1 = str1.substring(str2.length());

        System.out.println("After swapping: "+ "str1: "+str1+" "+ "str2: "+ str2);

    }
}
