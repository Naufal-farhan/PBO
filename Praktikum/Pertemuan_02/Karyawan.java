package Praktikum.Jobsheet.Pertemuan_02;

public class Karyawan {
    int id;
    String nama,jabatan;
    char jk;
    double gaji;

    public void tampilData(){
        System.out.println("ID Karyawan     : "+id);
        System.out.println("Nama Karyawan   : "+nama);
        System.out.println("Jenis Kelamin   : "+jk);
        System.out.println("Jabatan         : "+jabatan);
        System.out.println("Gaji            : "+gaji);
    }
    public void tampilGaji(){
        System.out.println("Gaji Karyawan   : "+gaji);
    }   
}
