package collections_workspace;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> llist = new LinkedList<>();

        llist.add("Yuvaraj");
        llist.add("Mahi");
        llist.add("Kaif");
        llist.addFirst("Sehwag");
        llist.addLast("Gambir");

//        System.out.println(llist);
//
//        for (String str : llist)
//        {
//            System.out.println(str);
//        }

        Iterator<String> itr = llist.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        llist.removeFirst();

        System.out.println(llist);

        llist.add(3,"Kohli");
        //llist.add(1,"Rohit");
        llist.add(1,"abhi");
        llist.add(0,"Hardik");
        System.out.println("------------------------");

        Iterator it = llist.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
       // System.out.println(llist);
    }
}
