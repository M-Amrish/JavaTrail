package Inheritance.Single;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.dogLeg);
        dog.eat();
        dog.sleep();
        dog.setName("Pinky");
        System.out.println(dog.getName());

    }
}

