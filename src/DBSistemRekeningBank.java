import java.util.Scanner;

public class DBSistemRekeningBank {
    public static void main(String[] args) {
        DBRekening rekening = new DBRekening();

        Scanner scanner = new Scanner(System.in);

        rekening.setNama("Handika Rado Arganata");
        rekening.setNomorRekening(1234);
        rekening.setSaldo(100000);

        rekening.info();

        System.out.println("Deposit atau Withdraw?");
        char pilihan = scanner.next().charAt(0);

        if (pilihan == 'D') {
            rekening.deposit();
            rekening.info();
        }

        scanner.close();
    }
}
