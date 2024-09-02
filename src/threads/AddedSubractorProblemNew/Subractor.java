package threads.AddedSubractorProblemNew;

public class Subractor implements  Runnable{

    public Count count;

    Subractor(Count x){
        count = x;
    }

    @Override
    public void run() {
        for(int i=1; i<=100; i++){
            count.incrementValue(-i);
        }
    }
}
