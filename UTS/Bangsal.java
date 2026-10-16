package Praktikum.UTS;

public class Bangsal {
    private String nama;
    private int tarifPerMalam;
    private Kamar[] daftarKamar;
    private Dokter kepala;

    public Bangsal(String nama, int jumlahKamar, int tarifPerMalam) {
        this.nama = nama;
        this.tarifPerMalam = tarifPerMalam;
        this.daftarKamar = new Kamar[Math.max(jumlahKamar, 0)]; 
        initKamar();
    }

    private void initKamar() {
        for (int i = 0; i < daftarKamar.length; i++) {
            daftarKamar[i] = new Kamar(i + 1, tarifPerMalam);
        }
    }

    public void setKepala(Dokter kepala) {
        this.kepala = kepala;
    }

    public Kamar getKamar(int nomor) {
        if (nomor < 1 || nomor > daftarKamar.length) { // guard indeks
            return null;
        }
        return daftarKamar[nomor - 1];
    }

    public void rawatInap(Pasien pasien) {
        if (pasien == null) { 
            System.out.println("Data Pasien tidak valid.");
            return;
        }
        for (Kamar u : daftarKamar) {
            if (u.isKosong()) {
                u.isiPasien(pasien);
                return;
            }
        }
        System.out.println("Semua Kamar di Bangsal " + nama + " penuh.");
    }

    public void rawatInap(Pasien pasien, int nomorKamar) {
        if (pasien == null) {
            System.out.println("Data Pasien tidak valid.");
            return;
        }
        Kamar u = getKamar(nomorKamar);
        if (u == null) { 
            System.out.println("Kamar " + nomorKamar + " tidak ada di Bangsal " + nama + ".");
            return;
        }
        if (!u.isKosong()) { 
            System.out.println("Kamar " + nomorKamar + " sudah terisi.");
            return;
        }
        u.isiPasien(pasien);
    }

    public void tampilInfo() {
        System.out.println("=== Info Bangsal " + nama + " ===");
        String k = (kepala == null)
                ? "-"
                : kepala.getNama() + " (" + kepala.getSpesialis() + ")";
        System.out.println("Kepala : " + k);
        for (Kamar u : daftarKamar) {
            String isi = u.isKosong() ? "kosong" : u.getPasien().getNama();
            System.out.println("Kamar " + u.getNomor() + " : " + isi);
        }
    }
}

