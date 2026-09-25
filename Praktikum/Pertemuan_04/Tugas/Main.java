package Praktikum.Pertemuan_04.Tugas;

public class Main {
    public static void main(String[] args) {
        Keranjang keranjang1 = new Keranjang("Laptop", 7500000);

        Pelanggan pelanggan1 = new Pelanggan("Andi", keranjang1);

        LayananPembayaran layanan = new LayananPembayaran();
        pelanggan1.bayar(layanan);
    }
}
