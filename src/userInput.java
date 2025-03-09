import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter you age: ");
        int age = scanner.nextInt();

        System.out.print("What is you GPA: ");
        double gpa = scanner.nextDouble();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your GPA is: " + gpa);

        scanner.close();
    }

}
