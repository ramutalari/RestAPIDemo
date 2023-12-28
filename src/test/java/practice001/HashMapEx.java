package practice001;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

public static void main(String args[]){
    HashMap<Integer, String> hmap = new HashMap<>();

    hmap.put(1, "UK");
    hmap.put(2, "England");
    hmap.put(3, "US");

    Set entrySet = hmap.entrySet();
    Iterator iterator = entrySet.iterator();

    while (iterator.hasNext()){
        Map.Entry me = (Map.Entry)iterator.next();
        System.out.println(me.getKey() + "  "+me.getValue());
    }
}

}
