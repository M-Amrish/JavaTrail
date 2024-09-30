package Comparable_Comparator.Comparator;

import java.util.*;

class Compare implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {

        if(o1 % 10 > o2 % 10){
            return 1;
        }else{
            return -1;
        }
    }
}
public class Main {
    public static void main(String[] args) {


        List<Integer> num = new ArrayList<>();

        Compare com = new Compare();

        num.add(93);
        num.add(34);
        num.add(56);
        num.add(71);
        num.add(42);

        Collections.sort(num,com);

        System.out.println(num);
    }
}
