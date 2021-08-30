package Workspace_02;

public class ReverseArrayPath {

    static String reversePath(String path)
    {
        char[] revPath = path.toCharArray();

        String result = "";
        String revWord = "";

        for (int i=revPath.length-1;i>=0;i--)
        {
            revWord = revPath[i]+revWord;

            if (String.valueOf(revPath[i]).equals("\\") || String.valueOf(revPath[i]).equals("/")
                    || String.valueOf(revPath[i]).equals(":") || i==0)
            {
                result = result + revWord;
                revWord = "";
            }
        }
        return result;
    }

    public static void main(String[] args) {

       final String[] paths = new String[]{
                "C:\\This\\is\\a\\sample\\path\\\\to\\a\\file.txt",
                "//another/kind/of/path.txt"};

        for(final String path : paths)
        {
           final String reversed = reversePath(path);
            System.out.println("path:   "+path);
            System.out.println("reversedpath: "+reversed);

        }
    }
}
