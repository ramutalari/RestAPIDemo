package collections_workspace;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator_Ex002 {
    @Test
    public void example(){

        ListIterator<String> litr = null;

        ArrayList<String> alist = new ArrayList<String>();
        alist.add("England");
        alist.add("Brillio");
        alist.add("Accenture");
        alist.add("JP Morgan");
        alist.add("London");

        litr = alist.listIterator();

        System.out.println("Forward Direction");

        while (litr.hasNext()){
            System.out.println(litr.next());
        }

        System.out.println("Backward Direction");

        while (litr.hasPrevious()){
            System.out.println(litr.previous());
        }
    }
}
