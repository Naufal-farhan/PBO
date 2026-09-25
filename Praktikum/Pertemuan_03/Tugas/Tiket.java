package Tugas;

public class Tiket {
    private String judulFilm;
    private double hargaDasar;
    private boolean statusPembayaran = false;

    public Tiket(String judulFilm, double hargaDasar) {
        this.judulFilm = judulFilm;
        if (hargaDasar < 0) {
            this.hargaDasar = 35000;
        } else {
            this.hargaDasar = hargaDasar;
        }
    }
    public String getJudulFilm() {
        return judulFilm;
    }
    public double getHargaDasar() {
        return hargaDasar;
    }
    public boolean getStatusPembayaran() {
        return statusPembayaran;
    }
    public void lakukanPembayaran() {
        statusPembayaran = true;
        System.out.println("Pembayaran berhasil dilakukan");
    }

}
