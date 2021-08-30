package Workspace_01;

class Hii implements Runnable
{
    public void run()
    {
        for (int i=1;i<=5;i++)
        {
            System.out.println("Hi");
           try {
               Thread.sleep(500);
           }
           catch (Exception e)
           {

           }
        }
    }
}

class Hellooo implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
}
    public class ThreadDemoRunnableInterface {

        public static void main(String[] args) {

            Runnable obj1 = new Hii();
            Runnable obj2 = new Hellooo();

            Thread t1 = new Thread(obj1);
            Thread t2 = new Thread(obj2);

            t1.start();
            try
            {
                Thread.sleep(10);
            }
            catch (Exception e){ }
            t2.start();
        }
    }

