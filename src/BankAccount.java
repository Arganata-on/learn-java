public class BankAccount {
    private int nomorRekening;
    private String namaPemilik;
    private double saldo;

    public BankAccount() {
        this.saldo = 10000;
    }

    public int getNomorRekening() {
        return nomorRekening;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNomorRekening(int nomorRekening) {
        this.nomorRekening = nomorRekening;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public void deposit(double ammount) {
        if (ammount > 0) {
            saldo += ammount;
            System.out.printf("Deposit sebesar Rp%,.2f berhasil. Saldo sekarang: Rp%,.2f%n", ammount, saldo);
        } else {
            System.out.println("Jumlah deposit harus positif!");
        }
    }

    public void withdraw(double ammount) {
        if (ammount > 0) {
            if (ammount <= saldo) {
                saldo -= ammount;
                System.out.printf("Penarikan sebesar Rp%,.2f berhasil. Saldo sekarang: Rp%,.2f%n", ammount, saldo);
            } else {
                System.out.println("Saldo tidak mencukupi untuk penarikan");
            }
        } else {
            System.out.println("Jumlah penarikan harus positif!");
        }

    }
}