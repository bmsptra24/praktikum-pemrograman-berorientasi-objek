package dasar1;

// Nama: Bima Saputra

public class Game {
    public static void main(String[] args){
        // Membuat objek Player
        Player petani = new Player();
        
        // Mengisi atribut Player
        petani.name = "Petani Kode";
        petani.speed = 78;
        petani.healthPoin = 100;
        
        // Menjalankan method run
        petani.run();
        
        // Memeriksa apakah Player sudah mati
        if (petani.isDead()) {
            System.out.println("Game Over!");
        }
    }
}
