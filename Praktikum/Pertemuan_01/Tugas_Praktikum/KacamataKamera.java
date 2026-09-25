package Praktikum.Pertemuan_01.Tugas_Praktikum; 
public class KacamataKamera extends Kacamata{
    private String merkKamera;
    private int resolusi;
    
    public KacamataKamera(String merk, int mines, String merkKamera, int resolusi) {
        super(merk, mines); 
        this.merkKamera = merkKamera;
        this.resolusi = resolusi;
    }   
    public void getInfoKamera() {
        super.getInfo();
        System.out.println("Merk Kamera     : " + merkKamera);
        System.out.println("Resolusi        : " + resolusi);
    }
}
