package UTS;

public class Pajak {
    private String vendor;
    private String tipe;
    private double harga;

    public Pajak(String vendor, String tipe, double harga) {
        this.vendor = vendor;
        this.tipe = tipe;
        this.harga = harga;
    }

    public String getVendor() {
        return vendor;
    }

    public String getTipe() {
        return tipe;
    }

    public double getHarga() {
        return harga;
    }

    public double perhitungan() {
        double pajak;
        if (harga > 8000000) {
            pajak = harga * 0.05;
        } else if (harga > 4500000) {
            pajak = harga * 0.02;
        } else if (harga > 4000000) {
            pajak = harga * 0.01;
        } else {
            pajak = 0;
        }
        return harga + pajak;
    }

    public void output() {
        System.out.println("\nVendor: " + vendor);
        System.out.println("Tipe: " + tipe);
        System.out.printf("Harga setelah PPN: Rp%,.2f%n", perhitungan());
    }
}