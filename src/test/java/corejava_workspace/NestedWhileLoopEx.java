package corejava_workspace;

public class NestedWhileLoopEx {

    public static void main(String[] args) {

        int i = 1;

        while (i <= 4) {
            System.out.println("Team " + i);
            int j = 1;
            while (j <= 3) {
                System.out.println("Team Member " + j);
                j++;
            }
            i++;
        }
    }
}
