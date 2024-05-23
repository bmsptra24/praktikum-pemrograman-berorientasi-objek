package defaultpackage;

// Nama  : Bima Saputra
// Kelas : 4IA

import modifier.Person;
 
public class Author {
    Person p = new Person();

    public Author() {
        // akan terjadi error di sini karena atribut name 
        // telah diberikan modifier protected
        p.name = "Petani Kode";
    }
}
