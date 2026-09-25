package Praktikum.Pertemuan_04.Percobaan_3;

public class MainPercobaan3 {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("123", "Spongebob");
        Pegawai asisten = new Pegawai("456", "Patrick");
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis, asisten);
        System.out.println(keretaApi.info());
    }
}
