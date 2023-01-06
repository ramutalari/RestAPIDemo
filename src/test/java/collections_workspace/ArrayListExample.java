package collections_workspace;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> alist = new ArrayList<String>();

        alist.add("Aadhya Ram");
        alist.add("Abhi Ram");
        alist.add("Siddarth Abhi Ram");
        alist.add("Abhimanyu");

        System.out.println(alist);

        alist.add(2,"Akhira Nandan");

        System.out.println(alist);

        //Replacing
        alist.set(4,"Arjun");

        alist.add("Lucy");
        alist.add("Anjaleena");

        System.out.println(alist);

        //how to remove element in ArrayList

        System.out.println("------removing Lucy------");
        alist.remove("Lucy");

        System.out.println(alist);

        alist.remove(5);
        System.out.println(alist);

        //iterating arraylist

        System.out.println("---iterating array list---");

        alist.add("Sachin");
        alist.add("Rahul Dravid");
        alist.add("Ganguly");

        for (String str:alist)
        {
            System.out.println(str);
        }

       //Sort arraylist
        System.out.println("----sorting array list---");

        Collections.sort(alist);

        for (String str1:alist)
        {
            System.out.println(str1);
        }

        System.out.println("---sorting in decending order---");

        //Collections.sort(alist);
        Collections.reverse(alist);

        for (String str2:alist)
        {
            System.out.println(str2);
        }
    }
}
