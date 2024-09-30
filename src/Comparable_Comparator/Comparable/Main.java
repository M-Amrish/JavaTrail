package Comparable_Comparator.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{

    public int age;
    public String name;

    Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Student that) {

        if(this.age  > that.age){
            return 1;
        }else{
            return -1;
        }
    }
}
public class Main {
    public static void main(String[] args) {

        List<Student> stu = new ArrayList<>();

        stu.add(new Student(42,"Raj"));
        stu.add(new Student(23, "Kumar"));
        stu.add(new Student(32,"John"));
        stu.add(new Student(29,"Amrish"));

        Collections.sort(stu);

        for (Student s : stu){
            System.out.println(s.age + " "+s.name );
        }

    }
}
