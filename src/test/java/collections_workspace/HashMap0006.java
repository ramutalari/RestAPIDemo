package collections_workspace;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap0006 {

    public static void main(String[] args) {

        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(1,"dkfj");
        hmap.put(2,"eiru");
        hmap.put(3,"oierujf");

        Set entryset = hmap.entrySet();
        Iterator iterator = entryset.iterator();

        while (iterator.hasNext())
        {
            Map.Entry mentry = (Map.Entry) iterator.next();
            System.out.println(mentry.getKey()+" and "+mentry.getValue());
        }

    }
}
