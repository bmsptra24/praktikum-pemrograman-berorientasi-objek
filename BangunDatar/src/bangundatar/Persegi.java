package bangundatar;

// Nama : Bima Saputra
// Kelas: 4IA
// NIM  : 062230801580

public class Persegi extends BangunDatar {
    int sisi;
    
    public Persegi(int sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public float luas() {
        return this.sisi * this.sisi;
    }
    
    @Override
    public float keliling() {
        return this.sisi * 4;
    }
}
