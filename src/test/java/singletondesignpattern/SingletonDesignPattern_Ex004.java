package singletondesignpattern;

import org.apache.commons.math3.analysis.function.Sin;

class Singleton
{
    static Singleton obj = new Singleton();

    private Singleton()
    {

    }

    public static Singleton getInstance()
    {
        return obj;
    }

}



public class SingletonDesignPattern_Ex004 {

    Singleton singleton = Singleton.getInstance();
}
