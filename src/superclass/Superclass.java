package superclass;

public class Superclass {
    public static void main(String[] args) {
        // super = Refers to the parent class (subclass <- superclass)
        // used in constructor and method overriding
        // Calls the parent constructor to initialize attributes

        Person person = new Person("Tom", "Riddle");
        Student student = new Student("Harry", "Potter", 3.25);
        Employee employee = new Employee("Rubeus", "Hagrid", 50000);

        person.showName();
        student.showName();
        student.showGPA();
        employee.showSalary();

    }
}
