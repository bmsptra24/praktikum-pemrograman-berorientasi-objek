package dasar3;

// Nama: Bima Saputra

public class Senjata {
    // atribut
    String nama;
    int jumlahPeluru;
    
    // method
    void tembak(){
        //..
        jumlahPeluru--;
        System.out.println("Jumlah Peluru: " + jumlahPeluru);
    }

    void reload(){
        //..
        jumlahPeluru = 300;
        System.out.println("Jumlah Peluru: " + jumlahPeluru);
    }
}
