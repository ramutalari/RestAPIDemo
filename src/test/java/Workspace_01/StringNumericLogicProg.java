package Workspace_01;

import java.util.HashMap;
import java.util.Map;

public class StringNumericLogicProg {

    public static void main(String[] args) {
        String input = "A2bc3d4e";
        String output = "";
        int counter = 0;
        Map<Integer, String> map = new HashMap<>();
        for (char ch : input.toCharArray())
        {
            counter++;
            if (!Character.isDigit(ch))
            {

                output = output + String.valueOf(ch);
            }
            else
            {
                for (int i=1;i<=Character.getNumericValue(ch);i++);
                System.out.print(output);
            }
           // output="";
            //System.out.println(output);
        }
        System.out.println(output);
    }
}
