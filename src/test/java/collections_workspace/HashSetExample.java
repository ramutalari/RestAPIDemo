package collections_workspace;

import org.testng.annotations.Test;

import java.util.*;

public class HashSetExample {

    @Test
    public void hashSetEx()
    {
        HashSet<String> hset = new HashSet<>();
        hset.add("Royal Enfield");
        hset.add("Meteor");
        hset.add("Honda");
        hset.add("Suzuki");
        hset.add("Honda");
        hset.add("null");
        hset.add("null");
        hset.add("Suzuki");

        System.out.println(hset);
        //iterate using iterator
        System.out.println("-----By using iterator-----");
        Iterator itr = hset.iterator();
       // Iterator<String> itr = hset.iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        //Without using iterator
        System.out.println("-----Without using iterator-----");
         for (String str:hset)
         {
             System.out.println(str);
         }

         //Delete all the elements from Hashset
//        hset.clear();
//        System.out.println("After deleting elements from hash set: "+hset);

        //Convert Hash Set to Array
        System.out.println("converting hash set to an array");
        String[] array = new String[hset.size()];
         hset.toArray(array);
         for (String str:array)
         {
             System.out.println(str);
         }

         //Converting hash set to tree set
        Set<String> tset = new TreeSet<String>(hset);
        System.out.println("Tree set contains:");
        System.out.println(tset);

        //Converting Hash set to Array List
        List<String> arrList = new ArrayList<String>(hset);
        System.out.println("After converting set to arraylist : "+arrList);
    }
}
