package ArrayList;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        // adding element
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        System.out.println("Before changing....");
        System.out.println(al);

        System.out.println("removed element" + al.remove(3));

        System.out.println("After doing...");
        System.out.println(al);

        System.out.println("Adding element 40...");
        al.add(1,40);

        System.out.println(al);

        System.out.println("Size of arrayList...." + al.size());





    }
}
