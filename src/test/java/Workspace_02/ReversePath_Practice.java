package Workspace_02;

public class ReversePath_Practice {


    static String reversePath(String path){

        char[] pathChar = path.toCharArray();

        String result = "";
        String wordRev = "";

        for (int i = pathChar.length-1;i>=0;i--)
        {
            wordRev = pathChar[i] +wordRev;

            if (String.valueOf(pathChar[i]).equals("\\") ||String.valueOf(pathChar[i]).equals("/") || String.valueOf(pathChar[i]).equals(":")
            || i ==0)
            {
                result = result + wordRev;
                wordRev="";
            }
        }
        return result;
    }

    public static void main(String[] args) {

        String[] paths = new String[] {"C:\\This\\is\\a\\sample\\path\\\\to\\a\\file.txt",
                "//another/kind/of/path.txt"};

        for (String path : paths)
        {
            String reversed = reversePath(path);
            System.out.println("path:"   +path);
            System.out.println("ReversePath:"+ reversed);
        }
    }
}
