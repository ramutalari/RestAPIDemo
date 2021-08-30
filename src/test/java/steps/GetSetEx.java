package steps;

public class GetSetEx {

    String ename;
    int sal;
    String loc;

    public void get1(String name)
    {
        ename= name;
    }

    public String set1()
    {
        return ename;
    }

    public void getSal(int salary)
    {
        sal = salary;
    }

    public int setSal()
    {
        return sal;
    }

}

class Example
{
    public static void main(String[] args) {
        GetSetEx g = new GetSetEx();
        g.get1("Abhiram");
        System.out.println(g.set1());

        g.getSal(35000);
        System.out.println(g.setSal());


    }
}