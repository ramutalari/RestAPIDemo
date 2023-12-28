package corejava_workspace;

public class MethodOverloadingEx {

    public int add(int n1, int n2){
        return n1 + n2;
    }

    public double add(double n1, int n2){
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }

}

class Practice{

    public static void main(String[] args){

        MethodOverloadingEx obj = new MethodOverloadingEx();
        int res = obj.add(2, 4);
        System.out.println(res);

        double res2 = obj.add(4.5, 5);
        System.out.println(res2);

        int res3 = obj.add(2, 4, 6);
        System.out.println(res3);
    }
}
