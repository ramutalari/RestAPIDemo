package collections_workspace;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {

    public static void main(String[] args) {

        ListIterator<String> litr = null;

        List<String> l = new ArrayList<String>();

        l.add("AbhiRam");
        l.add("Siddartha");
        l.add("Vamsi");
        l.add("Ajay");
        l.add("Charan");

        litr = l.listIterator();

        System.out.println("Traversing the list in forward direction");
        while (litr.hasNext())
        {
            System.out.println(litr.next());
        }
        System.out.println("Traversing the list in backward direction");
        while (litr.hasPrevious())
        {
            System.out.println(litr.previous());
        }
    }
}
