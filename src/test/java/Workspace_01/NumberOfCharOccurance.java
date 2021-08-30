package Workspace_01;

public class NumberOfCharOccurance {

    static void countEachChar(String str1) {

        int counter[] = new int[256];
        int len = str1.length();

        for (int i = 0; i < len; i++)
            counter[str1.charAt(i)]++;

        char arr[] = new char[len];
        for (int i = 0; i < len; i++) {
            arr[i] = str1.charAt(i);
            int flag = 0;

            for (int j = 0; j <=i; j++) {
                if (arr[i] == arr[j]) {
                    flag++;
                }
            }
            if (flag == 1) {
                System.out.println("Occurance of char " + str1.charAt(i) + " in the string are:" + counter[str1.charAt(i)]);
            }
        }
    }

    public static void main(String[] args) {
        String str = "AustraliaIndia";
        countEachChar(str);
    }
}
