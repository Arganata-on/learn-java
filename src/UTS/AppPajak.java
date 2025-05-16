package UTS;

import java.util.ArrayList;
import java.util.Scanner;

public class AppPajak {
    public static void main(String[] args) {
        ArrayList<Pajak> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah smartphone yang ingin dihitung: ");
        int jumlahSmartphone = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < jumlahSmartphone; i++) {
            System.out.println("\nMasukkan vendor Smartphone ke-" + (i + 1) + ": ");
            String vendor = scanner.nextLine();
            System.out.println("Masukkan tipe Smartphone ke-" + (i + 1) + ": ");
            String tipe = scanner.nextLine();
            System.out.println("Masukkan harga Smartphone ke-" + (i + 1) + ": ");
            double harga = scanner.nextDouble();
            scanner.nextLine();

            list.add(new Pajak(vendor, tipe, harga));
        }

        for (int i = 0; i < list.size(); i++) {
            list.get(i).output();
        }

        scanner.close();
    }
}