package threads.AddedSubractorProblem;

public class Added implements Runnable{

    public Count count;

    Added(Count x){
        count = x;
    }

    @Override
    public void run() {
        for(int i=0; i <10000; i++){
            count.value += i;
        }
    }
}
