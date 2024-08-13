package constructor;

public class Main {
    public static void main(String[] args) {
        Overloading overloading = new Overloading("Amrish", 24, "VCET", 88.80);
        overloading.display();

        Overloading overloading1 = new Overloading("Amrish", 24);
        overloading1.display();
    }
}
