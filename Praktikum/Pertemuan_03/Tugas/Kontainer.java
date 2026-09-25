package Tugas;

public class Kontainer {
    private String namaPemilik;
    private int kapasitasMaksimal;
    private int beratMuatan = 0;
    private String kode;

    public Kontainer(String kode, String namaPemilik, int kapasitasMaksimal) {
        this.namaPemilik = namaPemilik;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.kode = kode;
    }
    public String getNamaPemilik() {
        return namaPemilik;
    }
    public int getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }
    public int getBeratMuatan() {
        return beratMuatan;
    }
    public void tambahMuatan(int berat) {
        if (beratMuatan + berat > kapasitasMaksimal) {
            System.out.println("Muatan melebihi kapasitas maksimal!");
        } else {
            beratMuatan += berat;
        }
    }
    public void kurangiMuatan(int berat) {
        if (beratMuatan - berat < 0) {
            System.out.println("Berat muatan tidak bisa kurang dari 0!");
        } else if (berat > (beratMuatan/2)) {
            System.out.println
            ("Demi Keselamatan, berat muatan yang dikurangi tidak boleh lebih dari setengah berat muatan saat ini!");
        }
        else {
            beratMuatan -= berat;
        }
    }
}
