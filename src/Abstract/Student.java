package Abstract;

public class Student extends  College{


    Student(String name, int rollNo) {
        super(name, rollNo);
    }
    public void collegeName(){
        System.out.println("Student college name is SRM");
    }
    @Override
    public void display() {
        System.out.println("Student name is " + name);
        System.out.println("Student rollNo is " + rollNo);
    }
}
