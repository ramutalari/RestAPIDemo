package workspace_03;

public class SwappingStrings {

    public static void main(String[] args) {

        String str1 = "PawanKalyan";
        String str2 = "MaheshBabu";

        System.out.println("Before Swapping:"+ "str1: "+str1 + "  str2: "+str2);

        str1 = str1 + str2;
        str2 = str1.substring(0,str1.length()-str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("After Swapping:"+ "str1: "+str1 + "  str2: "+str2);

    }

}
