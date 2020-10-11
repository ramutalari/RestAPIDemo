package programspractice;

import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayListExample {

    @Test
    public static void main(String[] args) {

        //Converting Array to ArrayList

        String mobileBrands[] = {"OnePlus6T","Apple","Samsung","Nokia"};

        ArrayList<String> alist = new ArrayList<String>(Arrays.asList(mobileBrands));

        alist.add("Oppo");
        alist.add("mi");

        for (String str:alist)
        {
            System.out.println("Converting Arrays to ArrayList");
            System.out.println(str);
        }

        //Converting ArrayList to an Array

        String mobile[] = alist.toArray(new String[alist.size()]);
        for (String s:mobile)
        {
            System.out.println("Converting ArrayList to Array");
            System.out.println(s);
        }
    }
}
