// Nama : Bima Saputra
// Kelas: 4IA
// NIM  : 062230801580
package topik5operatorlogika;

public class Topik5OperatorLogika {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c;
        // konjungsi (dan)
        c = a && b;
        System.out.println("true && false = "+c);
        // disjungsi (atau)
        c = a || b;
        System.out.println("true || false = "+c);
        //negasi (bukan)|
        System.out.println("Negasi, true = "+ !a);
    }
    
}
