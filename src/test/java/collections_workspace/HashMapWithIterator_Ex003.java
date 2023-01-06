package collections_workspace;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapWithIterator_Ex003 {
    @Test
    public void exampleItrtr(){
        HashMap<Integer, String> hmap = new HashMap<>();

        hmap.put(1, "Anantapur");
        hmap.put(2, "Bangalore");
        hmap.put(3, "Dharmavaram");
        hmap.put(4, "Bangalore Urban");

        Set entryset = hmap.entrySet();
        Iterator it = entryset.iterator();

        while (it.hasNext()){
            Map.Entry me = (Map.Entry) it.next();
            System.out.println(me.getKey()+" "+me.getValue());
        }
    }
}
