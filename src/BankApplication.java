public class BankApplication {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.setNomorRekening(123);
        ba.setNamaPemilik("Handika Rado Arganata");

        System.out.println("Nomor rekening: " + ba.getNomorRekening());
        System.out.println("Nama pemilik: " + ba.getNamaPemilik());
        System.out.printf("Saldo awal: Rp%,.2f%n", ba.getSaldo());

        // ba.deposit(10000);
        ba.withdraw(2000);
    }
}