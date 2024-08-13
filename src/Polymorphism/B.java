package Polymorphism;

public class B extends A {

    public void display(String name){
        super.display("Amrish");
        System.out.println("B class is displaying..." + name);
    }
}