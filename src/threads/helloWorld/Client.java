package threads.helloWorld;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("1" + Thread.currentThread().getName());
        System.out.println("2" + Thread.currentThread().getName());

        // 1. Create an object of the task
        HelloWorldPrinting helloWorldPrinting = new HelloWorldPrinting();

        // 2. Create a thread
        Thread thread = new Thread(helloWorldPrinting);

        // 3. Start the thread
        thread.start();

        Thread.sleep(200);
        //thread.wait();
        System.out.println("3"+ Thread.currentThread().getName());
        System.out.println("4"+ Thread.currentThread().getName());
    }
}
