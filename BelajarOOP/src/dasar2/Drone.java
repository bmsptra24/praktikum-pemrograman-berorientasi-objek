package dasar2;

// Nama: Bima Saputra

public class Drone {
    // Atribut
    int energi;
    int ketinggian;
    int kecepatan;
    String merek;

    // Method untuk mengontrol drone terbang
    void terbang() {
        energi--;
        if (energi > 10) {
            // Terbang berarti nilai ketinggian bertambah
            ketinggian++;
            System.out.println("Drone terbang...");
        } else {
            System.out.println("Energi lemah: Drone tidak bisa terbang");
        }
    }

    // Method untuk mematikan mesin
    void matikanMesin() {
        if (ketinggian > 0) {
            System.out.println("Mesin tidak bisa dimatikan karena sedang terbang");
        } else {
            System.out.println("Mesin dimatikan...");
        }
    }

    // Method untuk menurunkan drone
    void turun() {
        if (ketinggian > 0) {
            ketinggian--;
            energi--;
            System.out.println("Drone turun");
        } else {
            System.out.println("Drone sudah berada di permukaan tanah");
        }
    }

    // Method untuk mengubah arah drone
    void belok() {
        energi--;
        System.out.println("Drone belok");
    }

    // Method untuk maju ke depan
    void maju() {
        energi--;
        System.out.println("Drone maju ke depan");
        kecepatan++;
    }

    // Method untuk mundur
    void mundur() {
        energi--;
        System.out.println("Drone mundur");
        kecepatan++;
    }
}
