package Tugas;

public class Encaptest {
    public static void main(String [] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("Eko");
        encap.setAge(35);
        System.out.println("Name    : " + encap.getName());
        System.out.println("Age     : " + encap.getAge());
    }
}