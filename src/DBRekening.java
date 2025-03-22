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
        System.out.printf("Saldo: %,.2f\n\n", saldo);
    }

    Scanner scanner = new Scanner(System.in);

    public void deposit() {
        System.out.print("Masukkan jumlah Deposit: ");
        double deposit = scanner.nextDouble();
        if (deposit >= 10000) {
            System.out.println("\nDeposit Berhasil!");
            saldo += deposit;
        } else {
            System.out.println("Jumlah minimal Deposit tidak memenuhi!");
            System.exit(0);
        }
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

                System.out.println("Jumlah minimal withdraw tidak memenuhi!");
                System.exit(0);
            }
        } while (withdraw > saldo);
    }

}
