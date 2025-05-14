package UTS;

public class BangunRuang {
    private int rusuk;
    private double panjang, lebar, tinggi, jari, volume, luas;

    public BangunRuang(int rusuk) {
        this.rusuk = rusuk;
    }

    public BangunRuang(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public BangunRuang(int jari, int tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
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

}