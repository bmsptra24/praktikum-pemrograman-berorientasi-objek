// Nama  : Bima Saputra
// Kelas : 4IA

package utspbo;

 
public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // ini method setter
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // ini method getter
    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public static void main(String[] args) {
        User user = new User("Bima Saputra", "Bismillah A");
        System.out.println("Username: " + user.getUsername());
        System.out.println("Password: " + user.getPassword());
    }
}
