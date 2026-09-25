package Praktikum.Pertemuan_01.Tugas_Praktikum;

public class MouseGaming extends Mouse {
    private String lampuRGB;
    private int macro;

    public MouseGaming(String merk, String warna, String lampuRGB, int macro) {
        super(merk, warna); 
        this.lampuRGB = lampuRGB;
        this.macro = macro;
    }
    public void getInfoGaming() {
        super.getInfo();
        System.out.println("Lampu RGB       : " + lampuRGB);
        System.out.println("Fitur Macro     : " + macro);
    }
}