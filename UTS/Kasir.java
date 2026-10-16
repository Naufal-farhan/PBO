package Praktikum.UTS;

public class Kasir {
    private String nama;

    public Kasir(String nama) {
        this.nama = nama;
    }

    public void cetakTagihan(Kamar kamar) {
        if (kamar == null) { // guard null
            System.out.println("Kamar tidak ditemukan.");
            return;
        }
        if (kamar.isKosong()) { 
            System.out.println("Kamar " + kamar.getNomor() + " kosong, tidak ada tagihan.");
            return;
        }

        Pasien p = kamar.getPasien();
        int total = p.hitungBiaya(kamar.getTarifPerMalam());
        Dokter s = p.getDpjp();
        String penanggungJawab = (s == null)
                ? "-"
                : s.getNama() + " (" + s.getSpesialis() + ")";

        System.out.println("=== Tagihan Kamar " + kamar.getNomor() + " ===");
        System.out.printf("%-12s: %s (%s) - %s%n", "Pasien", p.getNama(), p.getNoRM(), p.getJenis());
        System.out.printf("%-12s: %s%n", "DPJP", penanggungJawab);
        System.out.printf("%-12s: %d malam%n", "Lama Inap", p.getLamaInap());
        System.out.printf("%-12s: %d%n", "Total", total);
    }
}
