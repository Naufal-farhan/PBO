package Praktikum.UTS;

public class Kamar {
    private int nomor;
    private int tarifPerMalam;
    private Pasien pasien;

    public Kamar(int nomor, int tarifPerMalam) {
        this.nomor = nomor;
        this.tarifPerMalam = tarifPerMalam;
    }

    public void isiPasien(Pasien pasien) {
        if (pasien == null) {
            System.out.println("Kamar " + nomor + ": data Pasien tidak valid.");
            return;
        }
        if (!isKosong()) {
            System.out.println("Kamar " + nomor + " sudah terisi.");
            return;
        }
        this.pasien = pasien;
    }

    public Pasien getPasien() {
        return pasien;
    }

    public boolean isKosong() {
        return pasien == null;
    }

    public int getNomor() {
        return nomor;
    }

    public int getTarifPerMalam() {
        return tarifPerMalam;
    }
}
