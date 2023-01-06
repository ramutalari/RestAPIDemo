package collections_workspace;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapWithIterator_EX002 {

    @Test
    public void mapExample(){

        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        hmap.put(1, "Accenture");
        hmap.put(2,"Brillio");
        hmap.put(3,"JP Morgan");
        hmap.put(4,"Infosys");
        hmap.put(5,"TCS");
        hmap.put(6,"AmDocs");

        Set entryset = hmap.entrySet();

        Iterator it =entryset.iterator();

        while (it.hasNext()){
            Map.Entry me = (Map.Entry) it.next();
            System.out.println(me.getKey() + " "+me.getValue());
        }
    }
}
