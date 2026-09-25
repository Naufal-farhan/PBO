package Praktikum.Kuiz1;

public class Manajer {
    private String nama;

    public Manajer(String nama) {
        this.nama = nama;
    }

    public void review(Proyek p) {
        System.out.println("Nama Manajer : " + nama);
        System.out.print(p.info());
        System.out.println("Progres Proyek: " + p.hitungProgres() + "%");
    }
}