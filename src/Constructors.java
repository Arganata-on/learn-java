public class Constructors {
    public static void main(String[] args) {

        // constructor = A special method to initialize object
        // You can pass arguments to a constructor
        // and set up initial values

        Student student1 = new Student("Arganata", 21, 3.5, true);
        Student student2 = new Student("Josh", 18, 3.2, true);
        Student student3 = new Student("Mathew", 22, 3.8, false);

        student1.study();
        student2.study();
        student3.study();

    }
}
