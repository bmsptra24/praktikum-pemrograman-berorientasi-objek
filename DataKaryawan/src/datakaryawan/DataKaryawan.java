package datakaryawan;

// Mengimport scanner ke program

// Nama : Bima Saputra
// Kelas: 4IA

import java.util.Scanner;

public class DataKaryawan {

    public static void main(String[] args) {
        
// Deklarasi variabel 
        String nama, alamat;
        int usia, gaji;

// Membuat scanner baru 
        Scanner keyboard = new Scanner(System.in);
        
// Tampilkan output ke user 
        System.out.println("### Pendataan Karyawan PT. Petani Kode ###");
        System.out.print("Nama karyawan: "); 
        
//menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        nama = keyboard.nextLine();
        
// Tampilkan outpu lagi 
        System.out.print("Alamat: ");
        
// Enggunakan scanner lagi 
        alamat = keyboard.nextLine();
        System.out.print("Usia: ");
        usia = keyboard.nextInt();
        System.out.print("Gaji: ");
        gaji = keyboard.nextInt();

// Menampilkan apa yang sudah simpan di variabel 
        System.out.println("--------------");
        System.out.println("Nama Karyawan:" + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Usia:" + usia);
        System.out.println("Gaji: Rp " + gaji);
    }

}
