package KoperasiGetterSetter;

public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota();
        anggota1.setNama("Eko");
        anggota1.setAlamat("Malang");
        anggota1.setor(100000);
        System.out.println("Nama Anggota: " + anggota1.getNama());
        System.out.println("Alamat Anggota: " + anggota1.getAlamat());
        System.out.println("Simpanan Anggota: RP." + anggota1.getSimpanan());

        anggota1.pinjam(5000);
        System.out.println("Simpanan Anggota "+ anggota1.getNama() + ": RP." + anggota1.getSimpanan());
    }
}
