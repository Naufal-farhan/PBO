package Praktikum.Pertemuan_01.Tugas_Praktikum;
public class Kacamata {
    String warna;
    int mines;
    String tipeLensa = "Blue-ray";
    String status = "Terlepas";
    
    public Kacamata(String warna, int mines){
        this.warna = warna;
        this.mines = mines;
    }
public void diLepas(){
    if(status.equalsIgnoreCase("Terpakai")){
            status = "Terlepas";
        }else{
            System.out.println("KacaMata sudah Terlepas!!..");
        }
}
public void diPakai(){
    if(status.equalsIgnoreCase("Terlepas")){
            status = "Terpakai";
        }else{
            System.out.println("KacaMata sudah Terpakai!!..");
        }
}
public void gantiLensa(int newMines, String newLensa){
    this.tipeLensa = newLensa;
    this.mines = newMines;
}
public void getInfo(){
    System.out.println("Kacamata=================");
    System.out.println("Warna       :"+warna);
    System.out.println("Mines       : "+mines);
    System.out.println("Tipe Lensa  :"+tipeLensa);
    System.out.println("Status      :"+status);
}
}
