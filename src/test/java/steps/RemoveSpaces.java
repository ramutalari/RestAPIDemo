package steps;

public class RemoveSpaces {

    public static void main(String[] args) {

        String str = "win  d o   w    s";


        String s1 = str.replaceAll("\\s","");

        System.out.println(s1);
        //char arr1[] = str.toCharArray();
        //char arr1[] = str.toCharArray();

//        for (int i=0;i<str.length();i++)
//        {
//            System.out.println(arr1[i]);
//        }


       // System.out.println(s1);
    }
}
