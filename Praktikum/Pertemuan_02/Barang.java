package Praktikum.Jobsheet.Pertemuan_02;

public class Barang {
    public String namaBarang, jenisBarang;
    public int stok;

    public void tampilBarang(){
        System.out.println("Nama Barang     : "+namaBarang);
        System.out.println("Jenis Barang    : "+jenisBarang);
        System.out.println("Stok Barang     : "+stok);
    }

    public int tambahStok(int brgMasuk){
        int totalStok = stok + brgMasuk;
        return totalStok;
    }
}
