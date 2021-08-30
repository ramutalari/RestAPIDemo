package collections_workspace;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ExampleListIterator {

    public static void main(String[] args) {
        ListIterator<String> litr = null;

        List<String> country = new ArrayList<String>();
        country.add("Inida");
        country.add("UK");
        country.add("US");
        country.add("Australia");

        litr = country.listIterator();

        System.out.println("Traversing in forward direction");
        while (litr.hasNext())
        {
            System.out.println(litr.next());
        }
        System.out.println("Traversing in backward direction");
        while (litr.hasPrevious())
        {
            System.out.println(litr.previous());
        }
    }

}
