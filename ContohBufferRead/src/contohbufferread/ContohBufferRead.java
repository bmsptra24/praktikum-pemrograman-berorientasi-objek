package contohbufferread;

// Nama : Bima Saputra
// Kelas: 4IA

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContohBufferRead {

    public static void main(String[] args) throws IOException {

        String nama;

        // Membuat object inputsream
        InputStreamReader isr = new InputStreamReader(System.in);

        // Membuat object bufferreader
        BufferedReader br = new BufferedReader(isr);

        // Mengisi varibel nama dengan Bufferreader
        System.out.print("Inputkan nama: ");
        nama = br.readLine();

        // tampilkan output isi variabel nama
        System.out.println("Nama kamu adalah " + nama);
    }

}

