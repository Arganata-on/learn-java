public class Laptop {
    private String merk;
    private int ram;
    private double harga;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void info() {
        System.out.println("Merk: " + merk);
        System.out.println("Ram: " + ram);
        System.out.println("Harga: " + harga);
    }

}
