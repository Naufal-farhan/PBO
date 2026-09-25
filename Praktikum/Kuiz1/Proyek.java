package Praktikum.Kuiz1;

public class Proyek {
    private String nama;
    private Tugas[] daftarTugas;
    private int jumlahTugas;

    public Proyek(String nama, int kapasitas) {
        this.nama = nama;
        this.daftarTugas = new Tugas[kapasitas];
        this.jumlahTugas = 0;
    }

    public void tambahTugas(String judul, int bobot) {
        if (jumlahTugas < daftarTugas.length) {
            daftarTugas[jumlahTugas] = new Tugas(judul, bobot);
            jumlahTugas++;
        } else {
            System.out.println("Daftar Tugas sudah Penuh");
        }
    }

    public void tugaskan(int nomor, Programmer p) {
        int idx = nomor - 1;
        if (idx >= 0 && idx < jumlahTugas) {
            daftarTugas[idx].setProgrammer(p);
        } else {
            System.out.println("Tidak Ada Tugas no-" + nomor);
        }
    }

    public void selesaikan(int nomor) {
        int idx = nomor - 1;
        if (idx >= 0 && idx < jumlahTugas) {
            daftarTugas[idx].tandaiSelesai();
        } else {
            System.out.println("Tidak Ada Tugas no-" + nomor);
        }
    }

    public double hitungProgres() {
        if (jumlahTugas == 0) return 0.0;
        double totalSudah = 0;
        double totalSemua = 0;
        for (int j = 0; j < jumlahTugas; j++) {
            if (daftarTugas[j].isSelesai()) {
                totalSudah += daftarTugas[j].getBobot();
            }
            totalSemua += daftarTugas[j].getBobot();
        }
        if (totalSemua == 0) return 0.0;
        return (totalSudah / totalSemua) * 100;
    }

    public String info() {
        String info = "Nama Proyek: " + nama + "\n";
        for (int k = 0; k < jumlahTugas; k++) {
            info += (k + 1) + ". " + daftarTugas[k].info() + "\n";
        }
        return info;
    }
}