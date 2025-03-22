import java.util.Scanner;

public class SistemRekeningBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rekening rekening = new Rekening();

        System.out.println("=== Selamat Datang di Bank ===");
        System.out.print("Masukkan Nomor Rekening: ");
        rekening.setNomorRekening(scanner.nextLine());

        System.out.print("Masukkan Nama Pemilik Rekening: ");
        rekening.setNamaPemilik(scanner.nextLine());

        System.out.print("Masukkan Saldo Awal: ");
        rekening.setSaldo(scanner.nextDouble());

        System.out.println("\nInformasi Rekening Awal:");
        rekening.info();

        System.out.println("\n=== Transaksi ===");
        System.out.print("Masukkan jumlah deposit: ");
        double deposit = scanner.nextDouble();
        rekening.deposit(deposit);
        rekening.info();

        System.out.print("\nMasukkan jumlah penarikan: ");
        double withdraw = scanner.nextDouble();
        rekening.withdraw(withdraw);
        rekening.info();

        scanner.close();
    }
}

class Rekening {
    private String nomorRekening;
    private String namaPemilik;
    private double saldo;

    public void setNomorRekening(String nomorRekening) {
        this.nomorRekening = nomorRekening;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo tidak boleh negatif!");
        }
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposit(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Deposit berhasil: Rp " + jumlah);
        } else {
            System.out.println("Jumlah deposit harus positif!");
        }
    }

    public void withdraw(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Penarikan berhasil: Rp " + jumlah);
        } else if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi untuk penarikan!");
        } else {
            System.out.println("Jumlah penarikan harus positif!");
        }
    }

    public void info() {
        System.out.println("\nNomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp " + saldo);
    }
}