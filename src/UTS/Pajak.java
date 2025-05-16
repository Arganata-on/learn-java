package UTS;

public class Pajak {
    private String vendor;
    private String tipe;
    private double harga = 0;

    double ppn = 0;

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

    public double menghitungHargaPPN() {

        if (harga > 8000000) {
            ppn = harga * 0.05;
        } else if (harga > 4500000) {
            ppn = harga * 0.02;
        } else if (harga > 4000000) {
            ppn = harga * 0.01;
        } else {
            ppn = 0;
        }
        return ppn;
    }

    public double menghitungHargaIncludePPN() {
        return ppn + harga;
    }

    public void output() {
        System.out.println("\nVendor: " + vendor);
        System.out.println("Tipe: " + tipe);
        System.out.printf("Harga asli: Rp%,.2f%n", harga);
        System.out.printf("PPN: Rp%,.2f%n", menghitungHargaPPN());
        System.out.printf("Harga setelah PPN: Rp%,.2f%n", menghitungHargaIncludePPN());
    }
}