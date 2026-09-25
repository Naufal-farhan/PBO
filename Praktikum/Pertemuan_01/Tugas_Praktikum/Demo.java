package Praktikum.Pertemuan_01.Tugas_Praktikum;

public class Demo {
    public static void main(String[] args) {
       Kacamata km = new Kacamata("Hitam", 2);
       Mouse m      = new Mouse("Logitech", "Hitam");

       KacamataKamera kmk = new KacamataKamera("Melawai", 1, "Sony", 12);
       MouseGaming mg = new MouseGaming("Rexus", "Merah", "RGB", 5); 

       km.gantiLensa(4, "PhotoCromic");
       km.diPakai();
       km.getInfo(); 
       System.out.println("========================================");
       m.adjust(25);
       m.getInfo(); 
       System.out.println("========================================");
       kmk.getInfoKamera();
       System.out.println("========================================");
       mg.getInfoGaming();
    }
}
