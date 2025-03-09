public class Arithmetic {
    public static void main(String[] args) {
        // Arithmetic Operators

        int x1 = 10;
        int y1 = 2;
        int z1;

        z1 = x1 + y1;
        // z1 = x1 - y1;
        // z1 = x1 * y1;
        // z1 = x1 / y1;
        // z1 = x1 % y1;

        System.out.println("Arithmetic Operators: " + z1);

        // Augmented Assignment Operators

        int x2 = 10;
        int y2 = 3;

        x2 += y2;
        // x2 -= y2;
        // x2 *= y2;
        // x2 /= y2;
        // x2 %= y2;

        System.out.println("Augmented Assignment Operators: " + x2);

        // Increment and Decrement Operators

        int x3 = 1;

        x3++;
        // x3--;

        System.out.println("Increment and Decrement Operators: " + x3);

        // ORDER OF OPERATIONS [P-E-M-D-A-S]

        double result = 3 + 4 * (7 - 5) / 2;

        System.out.println("[P-E-M-D-A-S]: " + result);

    }
}
