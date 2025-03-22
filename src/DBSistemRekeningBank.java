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
            System.out.println("Pilih aksi: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();

            if (pilihan == 1) {
                rekening.deposit();
                rekening.info();
            }

            else if (pilihan == 2) {
                rekening.withdraw();
                rekening.info();
            } else if (pilihan == 3) {
                System.out.println("Terima kasih!");
            } else {
                System.out.println("Pilihan tidak valid!");
                rekening.info();
            }
        } while (pilihan != 3);

        scanner.close();
    }
}
