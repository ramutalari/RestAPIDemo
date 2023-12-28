package corejava_workspace;

public class WhileLoopEx {
    public static void main(String[] args) {
        int i=1;
        while (i<=5){
            System.out.println("Day: "+ i);
            int j=1;
            while (j<=3){
                System.out.println("Slot: "+j);
                j++;
            }
            i++;
        }

      //  System.out.println(i);
    }
}
