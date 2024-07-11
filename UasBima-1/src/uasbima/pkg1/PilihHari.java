package uasbima.pkg1;

import java.util.Scanner;

// Nama  : Bima Saputra
// Kelas : 4IA

public class PilihHari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode (1-7): ");
        int kode = scanner.nextInt();

        switch (kode) {
            case 1:
                System.out.println("Hari Minggu");
                break;
            case 2:
                System.out.println("Hari Senin");
                break;
            case 3:
                System.out.println("Hari Selasa");
                break;
            case 4:
                System.out.println("Hari Rabu");
                break;
            case 5:
                System.out.println("Hari Kamis");
                break;
            case 6:
                System.out.println("Hari Jum'at");
                break;
            case 7:
                System.out.println("Hari Sabtu");
                break;
            default:
                System.out.println("Kode tidak valid");
        }
    }
}
