import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        int numbers = random.nextInt(1, 7);

        System.out.println("Random numbers: " + numbers);

    }
}
