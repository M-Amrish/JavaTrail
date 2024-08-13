package hash;

import java.util.HashSet;

public class HashS {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(5);
        System.out.println("HAshSet" + hs);

        hs.add(6);
        hs.add(4);
        hs.add(5);
        System.out.println("New Hashset " + hs);

        System.out.println(hs.contains(2));

        System.out.println("Size " + hs.size());
        hs.remove(5);
        System.out.println(hs);
        Object clone = hs.clone();
        System.out.println(clone);
        hs.remove(2);
        System.out.println(hs);
        System.out.println(clone);
    }
}
