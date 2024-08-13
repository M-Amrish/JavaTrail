package constructor;

public class Overloading {
    public String  name;
    public int age;
    public String college;
    public double cgpa;

    Overloading(String name, int age, String college, double cgpa){
        this.name=name;
        this.age=age;
        this.college=college;
        this.cgpa=cgpa;
    }

    Overloading(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(college);
        System.out.println(cgpa);
    }
}
