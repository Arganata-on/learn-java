public class Rekening {
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