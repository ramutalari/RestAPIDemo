package singletondesignpattern;

class Emp
{
    static Emp emp = new Emp();

    private Emp()
    {

    }
     public static Emp getInstance() {
        return emp;
    }     
}
public class SingltonDesin_Ex2 {

    public static void main(String[] args) {

        Emp emp = Emp.getInstance();

    }
}
