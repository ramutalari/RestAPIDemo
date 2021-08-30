package collections_workspace;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_Using_Iterator {

    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(1, "Bangalore");
        hmap.put(2, "Goa");
        hmap.put(3, "Pune");
        hmap.put(4, "Hyderbad");
        hmap.put(5, "Kolkatta");

        Set entrySet = hmap.entrySet();

        Iterator it = entrySet.iterator();

        while (it.hasNext())
        {
            Map.Entry me = (Map.Entry)it.next();

            System.out.println("Key is: "+me.getKey()+"  value is: "+me.getValue());
        }
    }
}
