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
                System.out.print("\nMasukkan rusuk kubus dalam cm: ");
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
                System.out.print("\nMasukkan panjang balok dalam cm: ");
                int panjang = scanner.nextInt();
                System.out.print("Masukkan lebar balok dalam cm: ");
                int lebar = scanner.nextInt();
                System.out.print("Masukkan tinggi balok dalam cm: ");
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
            case 3:
                System.out.println("Masukkan jari-jari silinder dalam cm: ");
                int jari = scanner.nextInt();
                System.out.println("Masukkan tinggi silinder dalam cm: ");
                tinggi = scanner.nextInt();

                BangunRuang silinder = new BangunRuang(jari, tinggi);

                switch (menu2) {
                    case 1:
                        silinder.menghitungVolumeSilinder();
                        break;
                    case 2:
                        silinder.menghitungLuasSilinder();
                        break;

                    default:
                        System.out.println("Data tidak valid!");
                        break;
                }
                break;
            default:
                System.out.println("Data tidak Valid!");
                break;
        }

        scanner.close();

    }
}
