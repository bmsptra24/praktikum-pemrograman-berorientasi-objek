package uasbima.pkg2;

import java.util.Scanner;

// Nama  : Bima Saputra
// Kelas : 4IA

public class PilihBulan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode (1-12): ");
        int kode = scanner.nextInt();

        switch (kode) {
            case 1:
                System.out.println("Bulan Januari");
                break;
            case 2:
                System.out.println("Bulan Pebruari");
                break;
            case 3:
                System.out.println("Bulan Maret");
                break;
            case 4:
                System.out.println("Bulan April");
                break;
            case 5:
                System.out.println("Bulan Mei");
                break;
            case 6:
                System.out.println("Bulan Juni");
                break;
            case 7:
                System.out.println("Bulan Juli");
                break;
            case 8:
                System.out.println("Bulan Agustus");
                break;
            case 9:
                System.out.println("Bulan September");
                break;
            case 10:
                System.out.println("Bulan Oktober");
                break;
            case 11:
                System.out.println("Bulan Nopember");
                break;
            case 12:
                System.out.println("Bulan Desember");
                break;
            default:
                System.out.println("Kode tidak valid");
        }
    }
}
