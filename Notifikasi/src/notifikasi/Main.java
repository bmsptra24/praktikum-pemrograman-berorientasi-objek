package notifikasi;

// Nama : Bima Saputra
// Kelas: 4IA
// NIM  : 062230801580

public class Main {
    public static void main(String[] args) {
        String emailPenerima = "bimasaputra@example.com";
        String nomerHp = "+6281234567890";
        String mobileId = "android-123456";
        
        EmailNotification emailNotif = new EmailNotification();
        SMSNotification smsNotif = new SMSNotification();
        PushNotification pushNotif = new PushNotification();
        
        String message = "Tutorial Polimorfisme sudah terbit. Cek sekarang!";

        emailNotif.sendMessage(emailPenerima, message);
        smsNotif.sendMessage(nomerHp, message);
        pushNotif.sendMessage(mobileId, message);
    }
}
