package workspace_03;

import com.sun.codemodel.JForEach;

import javax.swing.*;

public class DuplicateChars {

    public static void main(String[] args) {

        String str = "abcABCRamRaM";

        char arr[] = str.toLowerCase().toCharArray();
        int len = str.length();
        for (int i=0;i<len;i++)
        {
            for (int j=i+1;j<len;j++)
            {
                if (arr[i]==arr[j])
                {
                    System.out.print(arr[j]+" ");
                    break;
                }
            }
        }

    }

}
