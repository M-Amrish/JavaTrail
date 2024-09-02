package threads.printOneToHundredThreadPool;

public class PrintOneToHundred implements Runnable{

    private int number;

    PrintOneToHundred(int number){
        this.number = number;
    }



    @Override
    public void run() {

        try {
            Thread.sleep(200);
            System.out.println(number + " " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


