package workspace_03;

public class SwappingWoutThirdVar05 {

    public static void main(String[] args) {
        int a = 20, b = 40;

        a = a+b;
        b = a-b;
        a=a-b;

        System.out.println(a);
        System.out.println(b);
    }
}
