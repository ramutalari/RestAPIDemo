package corejava_workspace;

public class MethodEx {

    public void add() {
        System.out.println("This method is for addition");
    }

    public int calc(int n1, int n2) {
        int res = n1 + n2;
        return res;
    }
}
    class Demo {
    public static void main(String[] args){
            MethodEx obj = new MethodEx();
            obj.add();
            int value =  obj.calc(10, 20);
            System.out.println(value);
        }
}
