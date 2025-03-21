public class Store {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();

        laptop.setMerk("ASUS");
        laptop.setRam(8);
        laptop.setHarga(9.99);

        laptop.info();
    }

}
