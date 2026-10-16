package Praktikum.UTS;

public class PasienUmum extends Pasien {
    private static final int BIAYA_ADMINISTRASI = 150000;

    public PasienUmum(String noRM, String nama, int lamaInap) {
        super(noRM, nama, lamaInap);
    }

    @Override
    public int hitungBiaya(int tarifPerMalam) {
        int dasar = super.hitungBiaya(tarifPerMalam);
        return dasar + BIAYA_ADMINISTRASI;
    }

    @Override
    public String getJenis() {
        return "Umum";
    }
}

