package corejava_workspace;

public class ForLoopEx {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Day "+ i);

            for (int j=1;j<=9;j++){
                System.out.println("Meeting from "+ (j+8) + "-" + (j+9));
            }
        }
    }
}
