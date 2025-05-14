package UTS;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih Bangun Ruang: ");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("WIP");
        System.out.println("WIP");
        int menu1 = scanner.nextInt();

        System.out.println("\nPilih rumus: ");
        System.out.println("1. Volume");
        System.out.println("2. Luas");
        int menu2 = scanner.nextInt();

        switch (menu1) {
            case 1:
                System.out.println("\nMasukkan rusuk kubus dalam cm: ");
                int rusuk = scanner.nextInt();

                BangunRuang kubus = new BangunRuang(rusuk);

                switch (menu2) {
                    case 1:
                        kubus.menghitungVolumeKubus();
                        break;
                    case 2:
                        kubus.menghitungLuasKubus();
                    default:
                        System.out.println("Data tidak Valid!");
                        break;
                }
                break;
            case 2:
                System.out.println("Masukkan panjang balok dalam cm: ");
                int panjang = scanner.nextInt();
                System.out.println("Masukkan lebar balok dalam cm: ");
                int lebar = scanner.nextInt();
                System.out.println("Masukkan tinggi balok dalam cm: ");
                int tinggi = scanner.nextInt();

                BangunRuang balok = new BangunRuang(panjang, lebar, tinggi);

                switch (menu2) {
                    case 1:
                        balok.menghitungVolumeBalok();
                        break;
                    case 2:
                        balok.menghitungLuasBalok();
                        break;
                    default:
                        System.out.println("Data tidak Valid!");
                        break;
                }
                break;

            default:
                break;
        }

        scanner.close();

    }
}
