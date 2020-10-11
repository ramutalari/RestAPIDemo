package steps;

public class A {
    int i;
    A()
    {
        System.out.println(i++);
    }

    public static void main(String[] args)
    {
        A a = new A();
    }
}
