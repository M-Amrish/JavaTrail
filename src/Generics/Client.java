package Generics;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        List<Animal> a = new ArrayList<Animal>();
        a.add(new Dog());
    }
}
