package Praktikum.Pertemuan_01;
class Product{
    private final String itemName;
    private final float price;
    static int totBrg=0;

    public Product(String itemName, float price ){
        this.itemName = itemName;
        this.price = price;
        totBrg++;
    }
    public float total(int quantity){
        return (quantity* price);
    }
    public String getName(){
        return itemName;
    }
    public static void totBelanjaan(){
        System.out.println("Total Belanjaan : " + totBrg);
    }
}
public class OOP{
    public static void main(String[] args) {
        Product product1 = new Product("Coffe",120000.0f);
        Product product2 = new Product("Sugar",30000.0f);
        Product product3 = new Product("Beras",80000.0f);

        System.out.println("Barang ke-1 = "+product1.getName()+" Dengan Total : "+product1.total(3));
        System.out.println("Barang ke-2 = "+product2.getName()+" Dengan Total : "+product1.total(1));
        System.out.println("Barang ke-3 = "+product3.getName()+" Dengan Total : "+product1.total(5));

        Product.totBelanjaan();
    }
}