package collections_workspace;

import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_Example {
    @Test
    public void hashMapEx()
    {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(10,"Dharmavaram");
        hmap.put(20,"Ananthapur");
        hmap.put(30,"Hyderabad");
        hmap.put(45,"Bangalore");

        Set set = hmap.entrySet();
        Iterator itr = set.iterator();
        while (itr.hasNext())
        {
            Map.Entry mentry = (Map.Entry)itr.next();
            System.out.println("Key is: "+mentry.getKey()+" & "+"Value is: "+mentry.getValue());
           // System.out.println(itr.next());
        }
        //Iterating hash map by using for and while loop
        System.out.println("By using for loop");
        for (Map.Entry me : hmap.entrySet())
        {
            System.out.println("key is :"+me.getKey() +" & value is : "+me.getValue());
        }

        //By using while loop

        System.out.println("By using while loop");
        Iterator iterator = hmap.entrySet().iterator();
        while (itr.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}
