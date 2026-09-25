package KoperasiGetterSetter;

public class Anggota {
    private String nama; 
    private String alamat;
    private float simpanan;

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public float getSimpanan() {
        return simpanan;
    }
    public void setor(float simpanan) {
        this.simpanan += simpanan;
    }
    public void pinjam(float simpanan) {
        this.simpanan -= simpanan;
    }
}
