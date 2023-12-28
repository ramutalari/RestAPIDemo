package corejava_workspace;

public class Ex {
    public static void main(String[] args) {

        int x = 5;

        int y = 10;

       int p = x++;
        int q = y--;

        System.out.println(p);
        System.out.println(y--);

        if(x++ > 5){
            System.out.println(x);
        }
        if (y-- < 10){
            System.out.println(y);
        }

      //  int z = (x++ > 5 && y-- < 10) ? x-- : y;

    }
}
