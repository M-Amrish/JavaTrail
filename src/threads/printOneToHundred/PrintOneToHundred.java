package threads.printOneToHundred;

public class PrintOneToHundred implements Runnable{

    private int number;

    PrintOneToHundred(int number){
        this.number = number;
    }



    @Override
    public void run() {
        System.out.println(number + " " + Thread.currentThread().getName());
    }
}
