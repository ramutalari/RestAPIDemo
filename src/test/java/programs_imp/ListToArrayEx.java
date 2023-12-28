package programs_imp;

import java.util.ArrayList;
import java.util.List;

public class ListToArrayEx {

    public static void main(String[] arr){

        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add("Java Script");

        String str[] = new String[list.size()];
        list.toArray(str);

        for (String values : str){
            System.out.println(values);
        }

    }
}
