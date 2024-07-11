/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uas;

/**
 *
 * @author bmsptra24
 */
import java.until.scanner;
public class UasRidwan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {scanner scanner = new scanner ( in:System.in)
            system.out,print(5:"masukkan kode hari (1-7): ")
            int kodehari +scanner.nextInt();
            
            string namaHari = getNamaHari(kodeHari);
            
            if (namaHari  != null)  {
            System.out.println("Hari: " + namaHari);
            } else }
               System.out,println(x:"Kode yang dimasukkan tidak valid")
            
        }
        
    }
    
}

public static String getNamaHari(int kodeHari)  {
      switch (kodeHari)  {
           case 1:
              return "minggu";
           case 2:
              return "senin";
           case 3: 
              return "selasa";
           case 4:
              return "rabbu";
           case 5:
              return "kamis";
           case 6:
              return "jum'at";
           case 7:
              return "sabtu":
           default :
               return null:
}