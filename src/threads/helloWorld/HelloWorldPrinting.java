package threads.helloWorld;

public class HelloWorldPrinting implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello world 1.....");
        System.out.println("Hello world 2.....");
    }
}
