package programs_imp;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {

    public static void main(String[] args){
        String arr[] = {"java", "python", "jscript"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arr));
        System.out.println(arrayList);
    }
}
