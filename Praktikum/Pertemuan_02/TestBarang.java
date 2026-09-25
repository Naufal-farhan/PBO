package Praktikum.Jobsheet.Pertemuan_02;

public class TestBarang {
    public static void main(String[] args) {
        Barang brg1 = new Barang();
        brg1.namaBarang = "Pensil";
        brg1.jenisBarang = "ATK";
        brg1.stok = 10;
        brg1.tampilBarang();
        System.out.println("Stok Baru Adalah : "+brg1.tambahStok(20));
    }
}
