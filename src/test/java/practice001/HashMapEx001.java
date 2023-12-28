package practice001;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx001 {

    public static void main(String args[]){
        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(1, "Selenium");
        hmap.put(2, "Cucumber");
        hmap.put(3, "Cypress");

        Set entryset = hmap.entrySet();
        Iterator iterator = entryset.iterator();

        while (iterator.hasNext()){
            Map.Entry me = (Map.Entry) iterator.next();
            System.out.println(me.getKey() + " "+ me.getValue());
        }
    }
}
