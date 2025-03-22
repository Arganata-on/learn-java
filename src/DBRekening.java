import java.util.Scanner;

public class DBRekening {
    private String nama;
    private int nomorRekening;
    private double saldo;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNomorRekening(int nomorRekening) {
        this.nomorRekening = nomorRekening;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNama() {
        return nama;
    }

    public void info() {
        System.out.println("Nama Pemilik Rekening: " + nama);
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.printf("Saldo: %,.2f\n\n", saldo);
    }

    Scanner scanner = new Scanner(System.in);

    public void deposit() {
        System.out.print("Masukkan Jumlah Deposit: ");
        double deposit = scanner.nextDouble();
        if (deposit > 10000) {
            System.out.println("\nDeposit Berhasil!");
            saldo += deposit;
        }
    }

}
