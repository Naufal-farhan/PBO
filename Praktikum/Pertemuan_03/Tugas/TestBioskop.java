package Tugas;

public class TestBioskop {
    public static void main(String[] args) {
        Tiket tiket1 = new Tiket("Avengers", 50000);
        System.out.println("Judul Film: " + tiket1.getJudulFilm());
        System.out.println("Harga Dasar: " + tiket1.getHargaDasar());
        System.out.println("Status Pembayaran: " + tiket1.getStatusPembayaran());
        System.out.println("===============================");
    
        tiket1.lakukanPembayaran();
        System.out.println("Status Pembayaran: " + tiket1.getStatusPembayaran());

    }
}
