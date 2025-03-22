import java.util.Scanner;

public class DBSistemRekeningBank {
    public static void main(String[] args) {
        DBRekening rekening = new DBRekening();

        Scanner scanner = new Scanner(System.in);

        rekening.setNama("Handika Rado Arganata");
        rekening.setNomorRekening("1234-5678-9012-34");
        rekening.setSaldo(100000);

        rekening.info();

        System.out.println("Deposit atau Withdraw?");
        char pilihan = scanner.next().charAt(0);

        if (pilihan == 'D') {
            rekening.deposit();
            rekening.info();
        }

        else if (pilihan == 'W') {
            rekening.withdraw();
            rekening.info();
        }

        scanner.close();
    }
}
