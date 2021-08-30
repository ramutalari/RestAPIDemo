package Workspace_01;

public class CommonEleInArray {

    public static void main(String[] args) {

        int numArray1[] = {2,5,7,11,9,0,55,11,90};
        int numArray2[] = {90,45,34,2,87,0,55};

        for(int i=0;i<numArray1.length;i++)
        {
            for (int j=0;j<numArray2.length;j++)
            {
                if (numArray1[i]==numArray2[j])
                {
                    System.out.println(numArray1[i]);
                    break;
                }
            }
        }
    }
}
