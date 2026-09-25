public class MainPercobaan1 {
    public static void main(String[] args) {
        Processor p = new Processor("Intel I5", 3);
        Laptop  l = new Laptop("ThinkPad", p);

        l.info();
        System.out.println("================================");
        Processor p1 = new Processor();
        p1.setMerk("Intel I5");
        p1.setCache(4);
        Laptop l1 = new Laptop();
        l1.setMerk("ThinkPad");
        l1.setProcessor(p1);
        l1.info();
        System.out.println("================================");
        Laptop l2 = new Laptop("ThinkPad",
            new Processor("Intel I5", 3));
        l2.info();
    }
}
