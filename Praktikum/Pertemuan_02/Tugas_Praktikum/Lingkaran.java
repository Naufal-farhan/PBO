package Praktikum.Jobsheet.Pertemuan_02.Tugas_Praktikum;

public class Lingkaran {
    double phi;
    double r;

    public double hitungLuas(){
        double luas = phi * r * r;
        return luas;
    }
    public double hitungKeliling(){
        double keliling = 2 * phi * r;
        return keliling;
    }
}
