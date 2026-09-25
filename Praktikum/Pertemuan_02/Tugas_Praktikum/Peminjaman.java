package Praktikum.Jobsheet.Pertemuan_02.Tugas_Praktikum;

public class Peminjaman {
    int idPelanggan;
    String namaPelanggan;
    String namaGame;    
    double hargaSewa;

    public void tampilData(int lamaSewa){
        System.out.println("ID Pelanggan    : "+idPelanggan);
        System.out.println("Nama Pelanggan  : "+namaPelanggan);
        System.out.println("Nama Game       : "+namaGame);
        System.out.println("Harga Sewa      : "+hargaSewa);
        System.out.println("Lama Sewa       : "+lamaSewa);
        System  .out.println("Total Bayar     : "+(hargaSewa*lamaSewa));
    }
}
