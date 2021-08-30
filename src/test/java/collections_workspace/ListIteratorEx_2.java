package collections_workspace;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx_2 {

    public static void main(String[] args) {

        ListIterator<String> litr = null;

        List<String> mobiles = new ArrayList<>();
        mobiles.add("iPhone");
        mobiles.add("Oneplus");
        mobiles.add("Oppo");

        litr = mobiles.listIterator();

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
