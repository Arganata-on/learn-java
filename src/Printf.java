public class Printf {
    public static void main(String[] args) {
        // printf() = is a method used to format output

        // %[flags][width][.precision][specifier-character]

        // printf()

        String name = "Arganata";
        char firstLetter = 'A';
        int age = 21;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("You name starts with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);
        System.out.printf("%s is %d years old\n", name, age);

        System.out.println();

        // [flags]

        // + = output a plus
        // , = coma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.printf("% .2f \n", price1);
        System.out.printf("% .2f \n", price2);
        System.out.printf("% .2f \n", price3);

        System.out.println();

        // [width]

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);

    }
}
