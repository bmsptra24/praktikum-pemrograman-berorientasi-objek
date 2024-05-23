package dasar3;

public class Game {
    public static void main(String[] args){
        Senjata senjata = new Senjata();
        
        senjata.nama = "Pistol";
        senjata.jumlahPeluru = 10;
        
        senjata.tembak();
        senjata.reload();
    }
}
