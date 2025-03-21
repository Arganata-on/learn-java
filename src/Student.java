public class Student {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    Student(String a, int b, double c, boolean d) {
        this.name = a;
        this.age = b;
        this.gpa = c;
        this.isEnrolled = d;
    }

    void study() {
        System.out.println(this.name + " is studying");
    }
}
