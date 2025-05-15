package UTS;

public class BangunRuang {
    int rusuk;
    double panjang, lebar, tinggi, jari, volume = 0, luas = 0;
    String nama;

    public BangunRuang(int rusuk) {
        nama = "Kubus";
        this.rusuk = rusuk;
    }

    public BangunRuang(int panjang, int lebar, int tinggi) {
        nama = "Balok";
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public BangunRuang(double jari, int tinggi) {
        nama = "Silinder";
        this.jari = jari;
        this.tinggi = tinggi;
    }

    public BangunRuang(double jari) {
        nama = "Bola";
        this.jari = jari;
    }

    public void menghitungVolumeKubus() {
        volume = Math.pow(rusuk, 3);
        showVolume();
    }

    public void menghitungLuasKubus() {
        luas = 6 * (Math.pow(rusuk, 2));
        showLuas();
    }

    public void menghitungVolumeBalok() {
        volume = panjang * lebar * tinggi;
        showVolume();
    }

    public void menghitungLuasBalok() {
        luas = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        showLuas();
    }

    public void menghitungVolumeSilinder() {
        volume = Math.PI * Math.pow(jari, 2) * tinggi;
        showVolume();
    }

    public void menghitungLuasSilinder() {
        luas = 2 * Math.PI * jari * (jari + tinggi);
        showLuas();
    }

    public void menghitungVolumeBola() {
        volume = 4.0 / 3.0 * Math.PI * Math.pow(jari, 3);
        showVolume();
    }

    public void menghitungLuasBola() {
        luas = 4 * Math.PI * Math.pow(jari, 2);
        showLuas();
    }

    public void showVolume() {
        System.out.println("\nVolume " + nama + ": " + volume + "cm³\n");
    }

    public void showLuas() {
        System.out.println("\nLuas " + nama + ": " + luas + "cm²\n");
    }

}