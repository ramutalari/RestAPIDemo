package Workspace_01;

public class CountEachCharacter_1 {

   static void countEachChar(String str1)
   {
       int count[] = new int[256];
       int len = str1.length();

       for (int i=0;i<len;i++)
           count[str1.charAt(i)]++;

       char arr[] = new char[str1.length()];
       for (int i=0;i<len;i++)
       {
           arr[i]=str1.charAt(i);
           int flag=0;

           for (int j=0;j<=i;j++)
           {
               if (arr[i]==arr[j])
                   flag++;
           }
           if (flag==1)
           {
               System.out.println("occurance of each char"+str1.charAt(i)+ " in the string are: "+count[str1.charAt(i)]);
           }
       }
   }

    public static void main(String[] args) {
        String str = "IndiaBengaluru";
        countEachChar(str);
    }
}
