package collections_workspace;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapWithIterator {

    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(1, "TCS");
        hmap.put(2, "Infosys");
        hmap.put(3, "Simens");
        hmap.put(9, "HCL");
        hmap.put(5, "Dell");

        Set entrySet = hmap.entrySet();

        Iterator it = entrySet.iterator();

        while (it.hasNext())
        {
            Map.Entry me = (Map.Entry)it.next();
            System.out.println(me.getKey()+" "+me.getValue());
        }

    }
}
