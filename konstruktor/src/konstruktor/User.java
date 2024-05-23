package konstruktor;

// Nama  : Bima Saputra
// Kelas : 4IA

public class User {
    public String username;
    public String password;

    public User(String username, String password){
        this.username = username;
        this.password = password;
    } 

}

class DemoConstructor {
    public static void main(String[] args) {
        User petani = new User("Bima Saputra", "Bismillah A");
        System.out.println("Username: " + petani.username);
        System.out.println("Password: " + petani.password);
    }
}