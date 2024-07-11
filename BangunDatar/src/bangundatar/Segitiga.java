package bangundatar;

// Nama : Bima Saputra
// Kelas: 4IA
// NIM  : 062230801580

public class Segitiga extends BangunDatar {
    int alas;
    int tinggi;
    
    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    public float luas() {
        return this.alas * this.tinggi / 2.0f;
    }
}
