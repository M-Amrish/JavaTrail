package threads.printOneToHundred;

public class Client {
    public static void main(String[] args) {
        for (int i=0; i<100; i++){

            PrintOneToHundred printOneToHundred = new PrintOneToHundred(i);

            Thread thread = new Thread(printOneToHundred);
            thread.start();
        }
    }
}
