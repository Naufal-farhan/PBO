package Praktikum.UTS;

public class PasienBPJS extends Pasien {
    private static final int PERSEN_BAYAR = 10;
    private String noBPJS;

    public PasienBPJS(String noRM, String nama, int lamaInap, String noBPJS) {
        super(noRM, nama, lamaInap);
        this.noBPJS = noBPJS;
    }

    @Override
    public int hitungBiaya(int tarifPerMalam) {
        int dasar = super.hitungBiaya(tarifPerMalam);
        return dasar * PERSEN_BAYAR / 100;
    }

    @Override
    public String getJenis() {
        return "BPJS";
    }

    public String getNoBPJS() {
        return noBPJS;
    }
}

