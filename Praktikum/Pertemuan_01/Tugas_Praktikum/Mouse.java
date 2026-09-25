package Praktikum.Pertemuan_01.Tugas_Praktikum; // Sesuaikan dengan struktur package project kamu
public class Mouse {
    private int sensi = 50;
    private String merk;
    private String warna;
    private String status = "off";

    public Mouse(String merk, String color) {
        warna = color;
        this.merk = merk;
    }
    public void adjust(int sensiBaru) {
        sensi = sensiBaru;
    }
    public void turnOn() {
        if (status.equalsIgnoreCase("off")) {
            status = "on";
        } else {
            System.out.println("Mouse Sudah Nyala!!..");
        }
    }
    public void turnOff() {
        if (status.equalsIgnoreCase("on")) {
            status = "off";
        } else {
            System.out.println("Mouse Sudah Mati!!..");
        }
    }
    public void getInfo() {
        System.out.println("Merk Mouse      : " + merk);
        System.out.println("Status          : " + status);
        System.out.println("Sensi Mouse     : " + sensi);
        System.out.println("Warna Mouse     : " + warna);
    }
}
