package Collection;

import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(2);
        List<Integer> linkedList = new LinkedList<>();


        Stack<Integer> stack = new Stack<>();
        Vector<Integer> stack1 = new Stack<>();
        List<Integer> stack2 = new Stack<>();


        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1); // 1
        linkedHashSet.add(21); // 1 <-> 21
        linkedHashSet.add(10); // 1 <-> 21 <-> 10
        linkedHashSet.remove(1); // 21 <-> 10
        linkedHashSet.add(50); // 21 <-> 10 <-> 50
        linkedHashSet.add(1); // 21 <-> 10 <-> 50 <-> 1

        for(Integer i: linkedHashSet) {
            System.out.println(i);
        }

        // TreeSet
        Set<Integer> treeSet = new TreeSet<>();

    }
}
