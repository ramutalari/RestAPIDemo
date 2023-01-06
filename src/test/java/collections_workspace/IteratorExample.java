package collections_workspace;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<>();

        alist.add("Apple");
        alist.add("Orange");
        alist.add("Mango");
        alist.add("Kiwi");
        alist.add("Cherry");
        System.out.println("iterator for list elements");
        Iterator iterator = alist.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        Set<String> set = new HashSet<>();
        set.add("null");
        set.add("sachin");
        set.add("dhoni");
        set.add("sachin");
        set.add("kohli");
        set.add("rohit");
        System.out.println("iterator for set elements");
        Iterator itr = set.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }

}
