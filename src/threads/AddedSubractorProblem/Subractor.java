package threads.AddedSubractorProblem;

public class Subractor implements  Runnable{

    public Count count;

    Subractor(Count x){
        count = x;
    }

    @Override
    public void run() {
        for(int i=0; i<10000; i++){
            count.value -= i;
        }
    }
}
