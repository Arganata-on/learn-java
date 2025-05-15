package UTS;

public class BangunRuang {
    int rusuk;
    double panjang, lebar, tinggi, jari, volume = 0, luas = 0;

    public BangunRuang(int rusuk) {
        this.rusuk = rusuk;
    }

    public BangunRuang(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public BangunRuang(double jari, int tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }

    public BangunRuang(double jari) {
        this.jari = jari;
    }

    public void menghitungVolumeKubus() {
        volume = Math.pow(rusuk, 3);
        System.out.println("\nVolume kubus: " + volume + "cm³\n");
    }

    public void menghitungLuasKubus() {
        luas = 6 * (Math.pow(rusuk, 2));
        System.out.println("\nLuas kubus: " + luas + "cm³\n");
    }

    public void menghitungVolumeBalok() {
        volume = panjang * lebar * tinggi;
        System.out.println("\nVolume balok: " + volume + "cm³\n");
    }

    public void menghitungLuasBalok() {
        luas = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        System.out.println("\nLuas balok: " + luas + "cm³\n");
    }

    public void menghitungVolumeSilinder() {
        volume = Math.PI * Math.pow(jari, 2) * tinggi;
        System.out.println("\nVolume silinder: " + volume + "cm³\n");
    }

    public void menghitungLuasSilinder() {
        luas = 2 * Math.PI * jari * (jari + tinggi);
        System.out.println("\nLuas silinder: " + luas + "cm³\n");
    }

    public void menghitungVolumeBola() {
        volume = 4.0 / 3.0 * Math.PI * Math.pow(jari, 3);
        System.out.println("Volume bola: " + volume + "cm³\n");
    }

    public void menghitungLuasBola() {
        luas = 4 * Math.PI * Math.pow(jari, 2);
        System.out.println("Luas bola: " + luas);
    }

}