package Workspace_01;

public class EncapsulationEx {

    int panNo;
    String Name;
    String location;

    public void setPANNum(int newPanNum)
    {
        panNo = newPanNum;
    }

    public void setName(String custname)
    {
        Name = custname;
    }
    public void setLocation(String empLoc)
    {
        location = empLoc;
    }

    public int getPanNo()
    {
        return panNo;
    }
    public String getName()
    {
        return Name;
    }
    public String getLocation()
    {
        return location;
    }

    public static void main(String[] args) {
        EncapsulationEx emp = new EncapsulationEx();
        emp.setPANNum(12356);
        emp.setName("Vivegam");
        emp.setLocation("Bangalore");

        System.out.println(emp.getName());
        System.out.println(emp.getPanNo());
        System.out.println(emp.getLocation());
    }
}

