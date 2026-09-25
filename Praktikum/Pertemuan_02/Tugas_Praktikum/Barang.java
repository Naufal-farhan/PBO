package Praktikum.Jobsheet.Pertemuan_02.Tugas_Praktikum;

public class Barang {
    String kode;
    String namaBarang;
    int hargaDasar;
    float diskon;

    public int hitungHargaJual(){
        int hargaJual = hargaDasar + (int)diskon;
        return hargaJual;
    }
    public void tampilData(){
        System.out.println("Kode Barang     : "+kode);
        System.out.println("Nama Barang     : "+namaBarang);
        System.out.println("Harga Dasar     : "+hargaDasar);
        System.out.println("Diskon          : "+diskon);
    }
}
