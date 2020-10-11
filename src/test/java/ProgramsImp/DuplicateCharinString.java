package ProgramsImp;

public class DuplicateCharinString {

    public static void main(String[] args) {

        String str = "beatiful beach";

        char array[] = str.toCharArray();
        System.out.println("Duplicate characters in the string "+ str +  " are: ");
        for (int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if (array[i]==array[j])
                {
                    System.out.println(array[j]+ " ");
                    break;
                }
            }
        }
    }
}
