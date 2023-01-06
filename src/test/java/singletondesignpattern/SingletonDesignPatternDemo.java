package singletondesignpattern;

class Abc
{
    //Step 1: Create a static object(instance) of the class
     static Abc obj = new Abc();

    //Step 2: Create private constructor which won't allow to create more than one instance
    private Abc()
    {

    }
    //step 3: in order to get object of that class -> create a static method which will return the object (instance)
    // of Abc class
    public static Abc getInstance()
    {
        return obj;
    }
}
public class SingletonDesignPatternDemo {

    public static void main(String[] args) {

        //getInstance method is static so calling by using class
        Abc obj1 = Abc.getInstance();

        //created private constructor so it is not allowing to create another instance
            // Abc obje3 = new Abc();
    }
}
