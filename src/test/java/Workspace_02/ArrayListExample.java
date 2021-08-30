package Workspace_02;

import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListExample {

    @Test
    public void m1()
    {
        ArrayList<String> alist = new ArrayList<>();
        alist.add(null);
        alist.add("jkl");
        alist.add("abc");
        alist.add("pqr");
        alist.add("pqr");
        alist.add(null);
        alist.add("xyz");
        alist.add(3,"bangalore");

        for (String str:alist)
        {
            System.out.println(str);
        }

    }
    @Test
    public void m2()
    {
        HashSet<String> hset = new HashSet<>();
        hset.add(null);
        hset.add(null);
        hset.add("lmn");
        hset.add("zyx");
        hset.add("zyx");
        hset.add("lmn");
        //hset.add(2,"hyderabad");

        for (String str1:hset)
        {
            System.out.println(str1);
        }

    }
}
