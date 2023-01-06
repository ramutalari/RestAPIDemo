package Workspace_01;

//Uper Case  letters ->   >=65 and <=90
//Lower Case letters ->   >=97 and <=122
//numbers ->   >=48 and <=57
//else it is a special character

public class CountUpperLowerNumSpecl {

    public static void count(String str)
    {
        int upper=0, lower = 0, num=0, special =0;

        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch>='A' && ch<='Z'){
                upper++;
            } else if(ch>='a' && ch<='z'){
                lower++;
            } else if (ch>='0' && ch<='9'){
                num++;
            }else {
                special++;}
        }
        System.out.println("Upper Case letters: "+upper);
        System.out.println("Lower Case letters: "+lower);
        System.out.println("Numbers: "+num);
        System.out.println("Special characters: "+special);
    }
    public static void main(String[] args) {

        String str = "?><>???AadhYAraM062021June@$%^&*()";
        count(str);
    }
}
