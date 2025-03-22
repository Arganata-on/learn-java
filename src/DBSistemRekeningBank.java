import java.util.Scanner;

public class DBSistemRekeningBank {
    public static void main(String[] args) {
        DBRekening rekening = new DBRekening();

        Scanner scanner = new Scanner(System.in);

        rekening.setNama("Handika Rado Arganata");
        rekening.setNomorRekening("1234-5678-9012-34");
        rekening.setSaldo(100000);

        rekening.info();

        int pilihan;

        do {
            System.out.println("Pilih Aksi: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            System.out.println("Masukkan Pilihan: ");
            pilihan = scanner.nextInt();

            if (pilihan == 1) {
                rekening.deposit();
                rekening.info();
            }

            else if (pilihan == 2) {
                rekening.withdraw();
                rekening.info();
            } else if (pilihan == 3) {
                System.out.println("Terima Kasih!");
            } else {
                System.out.println("Pilihan Tidak Valid!");
                rekening.info();
            }
        } while (pilihan != 3);

        scanner.close();
    }
}
