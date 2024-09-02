package threads.AddedSubractorProblem;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();

        Added added = new Added(count);

        Subractor subractor = new Subractor(count);

        Thread t1 = new Thread(added);
        Thread t2 = new Thread(subractor);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count.value);

    }
}
