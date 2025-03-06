public class Variable {
    public static void main(String[] args) {
        // variable = reuseable container for a value
        // a variable behaves as if it was the value it contain

        // Primitive = simple value stored directly in memory (stack)
        // Reference = memory address (stack) that points to the (heap)

        // Primitive = int, double, char, boolean
        // Reference = String, array, object

        // 2 Steps to creating a variable
        // ------------------------------
        // 1. declaration
        // 2.assignment

        int year = 2025;
        double price = 19.99;
        char grade = 'A';
        boolean isStudents = true;
        String food = "pizza";

        System.out.println("The year is " + year);
        System.out.println("$" + price);
        System.out.println(grade);

        if (isStudents) {
            System.out.println("You are a student!");

        } else {
            System.out.println("You are NOT a student!");
        }

        System.out.println("Your favorite food is: " + food);
    }

}
