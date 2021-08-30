package Workspace_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Chikoo");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Grapes");

        //Converting ArrayList to Array
           
        String str[] = fruits.toArray(new String[fruits.size()]);

        System.out.println("ArrayList to array:");
        for (String s:str)
        {
            System.out.println(s);
        }
        //Converting an Array to ArrayList

        ArrayList<String> alist = new ArrayList<String>(Arrays.asList(str));
        System.out.println("Array to ArrayList:");

        for (String s2:alist)
        {
            System.out.println(s2);
        }

    }

}
