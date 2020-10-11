package steps;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {

    public static void main(String[] args) {

        String cityList [] = {"Bangalore", "Hyderabad", "Pune", "Kerala"};

        ArrayList<String> alist = new ArrayList<String>(Arrays.asList(cityList));

        alist.add("Delhi");
        alist.add("Kashmir");

        for (String str : alist)
        {
            System.out.println(str);
        }
    }
}
