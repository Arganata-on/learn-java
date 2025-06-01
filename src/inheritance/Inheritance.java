package inheritance;

public class Inheritance {
    public static void main(String[] args) {
        // Inheritance = One class inherits the attributes and methods
        // from another class.
        // Child <- Parent

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println(dog.is_alive);
        System.out.println(cat.is_alive);

        dog.eat();
        cat.eat();

        System.out.println(dog.lives);
        System.out.println(cat.lives);
        System.out.println(plant.is_alive);

        dog.speak();
        cat.speak();
        plant.photosynthesize();

    }
}
