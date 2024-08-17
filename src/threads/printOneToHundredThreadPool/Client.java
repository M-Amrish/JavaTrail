package threads.printOneToHundredThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i=0; i<100; i++){

            PrintOneToHundred printOneToHundred = new PrintOneToHundred(i);
            executorService.execute(printOneToHundred);


        }
        executorService.shutdown();
    }
}
