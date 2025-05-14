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

    public void menghitungVolumeKubus() {
        volume = Math.pow(rusuk, 3);
        System.out.println("Volume kubus: " + volume);
    }

    public void menghitungLuasKubus() {
        luas = 6 * (Math.pow(rusuk, 2));
        System.out.println("Luas kubus: " + luas);
    }

    public void menghitungVolumeBalok() {
        volume = panjang * lebar * tinggi;
        System.out.println(volume);
    }

    public void menghitungLuasBalok() {
        luas = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        System.out.println(luas);
    }

}