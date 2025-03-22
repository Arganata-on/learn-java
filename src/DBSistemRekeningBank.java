import java.util.Scanner;

public class DBSistemRekeningBank {
    public static void main(String[] args) {
        DBRekening rekening = new DBRekening();

        Scanner scanner = new Scanner(System.in);

        rekening.setNama("Handika Rado Arganata");
        rekening.setNomorRekening("1234-5678-9012-34");
        rekening.setSaldo(100000);

        rekening.info();

        char pilihan;

        do {
            System.out.println("Deposit(d) atau Withdraw(w)?");
            pilihan = scanner.next().charAt(0);

            if (pilihan == 'd') {
                rekening.deposit();
                rekening.info();
            }

            else if (pilihan == 'w') {
                rekening.withdraw();
                rekening.info();
            }
        } while (pilihan != 'd' && pilihan != 'w');

        scanner.close();
    }
}
