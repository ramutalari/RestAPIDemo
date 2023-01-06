package collections_workspace;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Treemap_Ex {

    public static void main(String[] args) {

        TreeMap<Integer, String> tmap = new TreeMap<>();
        tmap.put(10,"data 10");
        tmap.put(2,"data 2");
        tmap.put(100,"data 100");
        tmap.put(3,"data 3");
        tmap.put(1,"data 1");
        tmap.put(4,"data 4");
        tmap.put(4,"data 4");
        tmap.put(100,"data 100");
        Set set = tmap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext())
        {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.println("Key value is: "+mentry.getKey() +"& value is: "+mentry.getValue());
        }
    }
}
