package collections_workspace;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class
LinkedHashMap_Ex {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhmap = new LinkedHashMap<>();

        lhmap.put(60, "Data 60");
        lhmap.put(22, "Data 22");
        lhmap.put(11, "Data 11");
        lhmap.put(16, "Data 16");
        lhmap.put(05, "Data 05");
        lhmap.put(01,"Data 01");

        Set set = lhmap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext())
        {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.println("Key value is: "+mentry.getKey() +" & value is: "+mentry.getValue());
        }

    }
}
