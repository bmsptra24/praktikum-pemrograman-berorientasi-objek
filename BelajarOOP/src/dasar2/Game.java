package dasar2;

// Nama: Bima Saputra

public class Game {
    public static void main(String[] args){
        // Membuat objek Player
        Drone controler = new Drone();
        
        // Mengisi atribut Player
        controler.energi = 100;
        controler.kecepatan = 10;
        controler.ketinggian = 300;
        controler.merek = "Honda";
        
        // Menjalankan method run
        controler.terbang();
        controler.belok();
        controler.maju();
        controler.mundur();
        controler.turun();
        controler.matikanMesin();
        
    }
}
