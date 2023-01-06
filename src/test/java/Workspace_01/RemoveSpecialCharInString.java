package Workspace_01;

public class RemoveSpecialCharInString {

    public static void main(String[] args) {

        String str = "Aadhya@@@@£$%%%&&*&*Ram@@£$%%$$$097755";
        str = str.replaceAll("[^a-zA-Z]","");
        System.out.println(str);

       /* String str= "This#string%contains^special*characters&.";
        str = str.replaceAll("[^a-zA-Z0-9]", " ");
        System.out.println(str);*/
    }
}
