package steps;

import java.io.ObjectInputStream;

public class GetterSetterEX {

    String empName;
    int empSalary;
    String location;

    public void getEmp(String name)
    {
        empName = name;
    }

    public String setEmp()
    {
        return empName;
    }
}
class Emp
{
    public static void main(String[] args) {
        GetterSetterEX g = new GetterSetterEX();
        g.getEmp("Ramu Talari");
        System.out.println(g.setEmp());
    }
}
