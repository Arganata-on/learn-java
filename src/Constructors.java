public class Constructors {
    public static void main(String[] args) {

        // constructor = A special method to initialize object
        // You can pass arguments to a constructor
        // and set up initial values
        
        Student student1 = new Student("Arganata", 21, 3.2);
        Student student2 = new Student("Josh", 10, 3.2);

        System.out.println(student1.name);
        System.out.println(student2.name);
    }
}
