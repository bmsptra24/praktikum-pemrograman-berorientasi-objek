// Nama  : Bima Saputra
// Kelas : 4IA

package utspbo;

public class Employee extends Person {
    float salary = 4000f;
    String name = "Bima Saputra";
    int age = 23;

    public Employee() {
        // eksekusi konstruktor induk
        super();
        System.out.println("Eksekusi konstruktor Employee()");
    }

    public void showInfo() {
        System.out.println("Name: " + super.name);
        System.out.println("Age: " + super.age);
        System.out.println("Salary: $" + salary);
    }

    public void info() {
        super.showMessage();
    }
}
