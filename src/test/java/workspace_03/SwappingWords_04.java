package workspace_03;

public class SwappingWords_04 {

    public static void main(String[] args) {

        String str1 = "Singapore";
        String str2 = "Tirupathi";
        System.out.println("Before swapping: "+" str1: "+str1+" & str2: "+str2);

        str1 = str1 + str2;
        str2 = str1.substring(0,str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("After  swapping: "+" str1: "+str1+" & str2: "+str2);
    }
}
