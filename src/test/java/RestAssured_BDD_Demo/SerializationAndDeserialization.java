package RestAssured_BDD_Demo;
import java.io.*;

class Test implements Serializable {
    int t1=10,t2=20;
}
public class SerializationAndDeserialization
{
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Test t1 = new Test();
        //Serialization
        FileOutputStream fos = new FileOutputStream("test.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(t1);

        //De-serialization
        FileInputStream fis = new FileInputStream("test.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Test t = (Test) ois.readObject();

        System.out.println(t.t1);
        System.out.println(t.t2);
    }
}
