package Praktikum.Kuiz1;

public class Main {
    public static void main(String[] args) {
        Manajer m = new Manajer("Pak Rudi");
        Proyek p = new Proyek("Aplikasi SIAKAD",3);
        p.tambahTugas("Desain Database",30);
        p.tambahTugas("Modul Login",20);
        p.tambahTugas("Modul KRS",50);
        p.tambahTugas("Modul Nilai",40);

        Programmer pm1 = new Programmer("Dimas","Backend");
        Programmer pm2 = new Programmer("Laras","FrontEnd");

        p.tugaskan(1, pm1);
        p.tugaskan(2, pm2);
        p.tugaskan(5, pm1);

        p.selesaikan(1);
        p.selesaikan(2);

        m.review(p);
    }
}
