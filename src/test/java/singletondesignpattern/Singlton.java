package singletondesignpattern;


class Example
{
    static Example ex = new Example();

    private Example()
    {

    }
    static Example getInstance()
    {
        return ex;
    }

}

public class Singlton {

    Example ex = Example.getInstance();

}
