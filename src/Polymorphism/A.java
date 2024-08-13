package Polymorphism;

public class A {

    public void sum(int a, int b){
        System.out.println("Sum of two number integer " +( a+b));
    }

    public void sum(double a, double b){

        System.out.println("Sum of two number double " + (a+b));

    }


    public void sum (String a, String b){

        System.out.println("Sum of two number String " +( a+b));

    }


    public void display(String name){
        System.out.println("A class is displaying..." + name);
    }
}
