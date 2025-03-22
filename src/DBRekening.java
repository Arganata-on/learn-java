import java.util.Scanner;

public class DBRekening {
    private String nama;
    private String nomorRekening;
    private double saldo;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNomorRekening(String nomorRekening) {
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
        System.out.printf("Saldo: Rp %,.2f\n\n", saldo);
    }

    Scanner scanner = new Scanner(System.in);

    public void deposit() {
        double deposit;

        do {
            System.out.print("\nMasukkan jumlah Deposit: ");
            deposit = scanner.nextDouble();

            if (deposit < 10000) {
                System.out.println("\nJumlah minimal Deposit tidak memenuhi!");
                System.out.println("Minimal deposit adalah Rp 10.000");
            } else {
                System.out.println("\nDeposit Berhasil!");
                saldo += deposit;
            }
        } while (deposit < 10000);
    }

    public void withdraw() {
        double withdraw;

        do {
            System.out.print("\nMasukkan jumlah Withdraw: ");
            withdraw = scanner.nextDouble();

            if (withdraw > saldo) {
                System.out.println("Saldo tidak mencukupi!");
                System.out.printf("Saldo: %,.2f\n\n", saldo);
            } else if (withdraw >= 10000) {
                System.out.println("\nWithdraw berhasil!");
                saldo -= withdraw;
                break;
            } else {

                System.out.println("\nJumlah minimal withdraw tidak memenuhi!");
                System.out.println("Minimal Withdraw adalah Rp 10.000");
            }
        } while (withdraw > saldo || withdraw < 10000);
    }

}
