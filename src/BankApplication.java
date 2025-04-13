public class BankApplication {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.setNomorRekening(1);
        ba.setNamaPemilik("Arga");

        System.out.println("Nomor rekening: " + ba.getNomorRekening());
        System.out.println("Nama pemilik: " + ba.getNamaPemilik());
        System.out.println("Saldo awal: " + ba.getSaldo());

        // ba.deposit(10000);
        ba.withdraw(2000);
    }
}