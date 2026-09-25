package Praktikum.Pertemuan_04.Tugas;

public class Pelanggan {
    private String nama;
    private Keranjang keranjang;

    public Pelanggan(String nama, Keranjang keranjang) {
        this.nama = nama;
        this.keranjang = keranjang;
    }

    public void bayar(LayananPembayaran layanan) {
        double total = keranjang.getProduk().getHarga();
        System.out.println(nama + " melakukan pembayaran...");
        layanan.prosesBayar(total);
    }
}
