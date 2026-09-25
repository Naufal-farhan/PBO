package MotorEncapsulation;

public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;
    public void nyalakanMesin() {
        kontakOn = true;
    }
    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }
    public void tambahKecepatan() {
        if ((kontakOn == true) && (kecepatan < 100)) {
            kecepatan += 5;
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin Off atau kecepatan sudah 100 km/jam");
        }
    }
    public void kurangiKecepatan() {
        if ((kontakOn == true) && (kecepatan > 0)) {
            kecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena mesin Off atau kecepatan sudah 0 km/jam");
        }
    }
    public void printStatus(){
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + " km/jam");
    }
}
