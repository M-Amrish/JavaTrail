package threads.AddedSubractorProblemNew;

public class Count {

    public int value;

    public synchronized void incrementValue(int i){
        this.value += i;
    }

    public int getValue(){
        return this.value;
    }

}
