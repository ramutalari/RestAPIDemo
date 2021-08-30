package Workspace_01;

public class ReversePath {

    static String reversePath(String str) {

        String[] words = str.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {

               reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        //System.out.println(str);
        //System.out.println(reversedString);

        return reversedString;
    }
    public static void main(String[] args) {

        // Objective:        //
        // Implement the missing "reversePath" function as used below.        //
        // This should produce the following example output
        // when the program is executed:        //
        // Path:          C:\This\is\a\sample\path\\to\a\file.txt
        // Path Reversed: file.txt\a\to\\path\sample\a\is\This\C:        //
        // Path:          //another/kind/of/path.txt
        // Path Reversed: path.txt/of/kind/another//        //
        final String[] paths = new String[]{
                "C:\\This\\is\\a\\sample\\path\\\\to\\a\\file.txt",
                "//another/kind/of/path.txt"};

        for (final String path : paths) {
            final String reversed = reversePath(path);
            System.out.println("Path:          " + path);
            System.out.println("Path Reversed: " + reversed);
        }
    }
}

//      StringBuilder revStr = new StringBuilder("");
//      int end = path.length();
//      int counter = path.length()-1;
//      for (int i=counter;i>=0;i--){
//          if (path.charAt(i)==' '||i==0){
//              if (i!=0){
//                  revStr.append(path.substring(i+1, end));
//                  revStr.append(" ");
//              }
//              else
//              {
//                  revStr.append(path.substring(i,end));
//              }
//              end = counter;
//          }
//          counter--;
//      }
//        System.out.println(revStr);
//    //  return reversePath();
//        return null;

