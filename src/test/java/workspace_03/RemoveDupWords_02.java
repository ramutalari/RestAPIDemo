package workspace_03;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDupWords_02 {

    public static void main(String[] args) {

        String str ="I am From am I from Bangalore I bangalore from";

        String str2 = str.toLowerCase();

        str2 = Arrays.stream(str2.split("\\s+")).distinct().collect(Collectors.joining(" "));

        System.out.println(str2);
    }
}
