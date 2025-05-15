package UTS;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu Bangun Ruang: ");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Silinder");
        System.out.println("4. Bola");
        System.out.print("Masukkan pilihan (1-4): ");
        int menu1 = scanner.nextInt();

        System.out.println("\nMenu Rumus: ");
        System.out.println("1. Volume");
        System.out.println("2. Luas");
        System.out.print("Masukkan pilihan (1-2): ");
        int menu2 = scanner.nextInt();

        switch (menu1) {
            case 1:
                System.out.print("\nMasukkan rusuk kubus (cm): ");
                int rusuk = scanner.nextInt();

                BangunRuang kubus = new BangunRuang(rusuk);

                switch (menu2) {
                    case 1:
                        kubus.menghitungVolumeKubus();
                        break;
                    case 2:
                        kubus.menghitungLuasKubus();
                        break;
                    default:
                        System.out.println("Data tidak Valid!");
                        break;
                }
                break;
            case 2:
                System.out.print("\nMasukkan panjang balok (cm): ");
                int panjang = scanner.nextInt();
                System.out.print("Masukkan lebar balok (cm): ");
                int lebar = scanner.nextInt();
                System.out.print("Masukkan tinggi balok (cm): ");
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
                System.out.print("\nMasukkan jari-jari silinder dalam cm: ");
                double jari = scanner.nextInt();
                System.out.print("Masukkan tinggi silinder dalam cm: ");
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
            case 4:
                System.out.print("\nMasukkan jari-jari bola dalam (cm): ");
                jari = scanner.nextInt();

                BangunRuang bola = new BangunRuang(jari);

                switch (menu2) {
                    case 1:
                        bola.menghitungVolumeBola();
                    case 2:
                        bola.menghitungLuasBola();
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
