package Abstract;

abstract public class College {

    public String name ;
    public int rollNo;

    College(String name, int rollNo){
        this.name = name;
        this.rollNo =rollNo;
    }


    public abstract void  display();

    public void collegeName(){
        System.out.println("Student college name is VCET");
    }




}
