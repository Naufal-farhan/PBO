package Praktikum.Jobsheet.Pertemuan_02;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = "254107020077";
        mhs1.nama = "Naufal Farhan";
        mhs1.alamat = "Jl. Raya Bogor";
        mhs1.kelas = "TI-1D";

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = "254107020078";
        mhs2.nama = "Rizky";
        mhs2.alamat = "Jl. Raya Jakarta";
        mhs2.kelas = "TI-1D";
        
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = "254107020079";
        mhs3.nama = "Siti";
        mhs3.alamat = "Jl. Raya Surabaya";
        mhs3.kelas = "TI-1D";
        System.out.println("========================================");
        System.out.println("Data Mahasiswa 1");
        mhs1.tampilData();
        System.out.println("========================================");
        System.out.println("Data Mahasiswa 2");
        mhs2.tampilData();
        System.out.println("========================================");
        System.out.println("Data Mahasiswa 3");
        mhs3.tampilData();
    }
}
