package threads.AddedSubractorProblemNew;

public class Added implements Runnable{

    public Count count;

    Added(Count x){
        count = x;
    }

    @Override
    public void run() {
        for(int i=1; i <= 100; i++){
            count.incrementValue(i);
        }
    }
}
