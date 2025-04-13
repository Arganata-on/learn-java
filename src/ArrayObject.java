public class ArrayObject {

    public static void main(String[] args) {
        Car[] cars = { new Car("Mustang", "Red"), new Car("Corvette", "Blue"), new Car("Charger", "Yellow") };

        // Enhanced for loop
        for (Car car : cars) {
            car.color = "Black";
        }
        for (Car car : cars) {
            car.drive();
        }
    }
}