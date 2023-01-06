package collections_workspace;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableEx {

    public static void main(String[] args) {

        Hashtable<String, String> htable = new Hashtable<>();
        //htable.put("1", null);
        htable.put("2","Delhi");
        htable.put("3", "Bangalore");

        Enumeration enumeration = htable.keys();
        while (enumeration.hasMoreElements())
        {
            String key = (String) enumeration.nextElement();
            System.out.println(key + " " + htable.get(key));
        }
    }
}
