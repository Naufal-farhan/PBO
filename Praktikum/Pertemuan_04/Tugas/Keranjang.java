package Praktikum.Pertemuan_04.Tugas;

public class Keranjang {
    private Produk produk; 

    public Keranjang(String namaProduk, double harga) {
        this.produk = new Produk(namaProduk, harga);
    }

    public Produk getProduk() {
        return produk;
    }
}
