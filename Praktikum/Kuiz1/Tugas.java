package Praktikum.Kuiz1;

public class Tugas {
    private String judul;
    private int bobot;
    private Programmer programmer;
    private boolean selesai;

    public Tugas(String judul, int bobot) {
        this.judul = judul;
        this.bobot = bobot;
        this.selesai = false;
    }

    public void setProgrammer(Programmer programmer) {
        this.programmer = programmer;
    }

    public void tandaiSelesai() {
        this.selesai = true;
    }

    public boolean isSelesai() {
        return selesai;
    }

    public int getBobot() {
        return bobot;
    }

    public String info() {
        String info = "";
        info += "Judul: " + judul + "\n";
        info += "Bobot: " + bobot + "\n";
        info += "Programmer: " + (programmer != null ? programmer.getNama() : "Belum ditugaskan") + "\n";
        info += "Selesai: " + selesai + "\n";
        return info;
    }
}