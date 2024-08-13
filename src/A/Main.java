package A;

public class Main {
    public static void main(String[]args){
       Teacher teacher = new Teacher();
       System.out.println("before using set");
       teacher.display();
       System.out.println("after using set");
       teacher.setName("amri");
       teacher.display();
    }
}
