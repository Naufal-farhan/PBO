package Tugas;
import java.util.Scanner;
public class TesLogistik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kontainer KontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);
 
        System.out.println("Nama Pemilik Kontainer: " + KontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal Kontainer: " + KontainerAlfa.getKapasitasMaksimal());
        

        System.out.print("Memasukkan Berat Muatan : ");
        int beratMuatan = sc.nextInt();
        KontainerAlfa.tambahMuatan(beratMuatan);
        System.out.println("Berat Muatan Saat Ini : " + KontainerAlfa.getBeratMuatan()+" kg");

        System.out.print("Memasukkan Berat Muatan yang ingin dikurangi : ");
        int beratDikurangi = sc.nextInt();
        KontainerAlfa.kurangiMuatan(beratDikurangi);
        System.out.println("Berat Muatan Saat Ini : " + KontainerAlfa.getBeratMuatan()+" kg");

    }
}
