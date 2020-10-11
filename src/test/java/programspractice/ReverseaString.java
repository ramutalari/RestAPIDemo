package programspractice;

public class ReverseaString {

    public static void main(String[] args) {
        String str = "Automation Testing";
        StringBuilder str2 = new StringBuilder(str);
       str2= str2.reverse();

       char[] abc = str.toCharArray();

        for (int i = str2.length()-1;i >= 0; i--)
            System.out.print(abc[i]);

        //String reverse = new StringBuffer(str).reverse().toString();
        //str2.append(str);
        //str2 = str2.reverse();
        //StringBuilder sb=new StringBuilder(str2);



        System.out.println(str2);
        //System.out.println(reverse);

        //System.out.println(str2);

      //        StringBuilder str3 = new StringBuilder(str2);
//        str3 = str3.reverse();
//        System.out.println(str3);

    }

//    public static void main(String[] args) {
//        String str = "Welcome to Beginnersbook";
//        String reversed = reverseString(str);
//        System.out.println("The reversed string is: " + reversed);
//    }
//
//    public static String reverseString(String str2)
//    {
////        if (str.isEmpty()==true)
////            return str;
//        //Calling Function Recursively
//        return reverseString(str2.substring(1)) + str2.charAt(0);
//    }


}
