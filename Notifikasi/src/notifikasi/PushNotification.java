package notifikasi;

// Nama : Bima Saputra
// Kelas: 4IA
// NIM  : 062230801580

public class PushNotification implements InterfaceNotifikasi {
    @Override
    public void sendMessage(String receiver, String content) {
        System.out.println("Mengirim Push Notif ke " + receiver + " dengan isi:");
        System.out.println(content);
    }
}
