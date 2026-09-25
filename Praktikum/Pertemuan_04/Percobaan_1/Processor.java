public class Processor {
    private String merk;
    private double cache;

    public Processor(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }
    public Processor() {
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getMerk() {
        return merk;
    }
    public void setCache(double cache) {
        this.cache = cache;
    }
    public double getCache() {
        return cache;
    }
    public void info() {
        System.out.println("Merk Processor: " + merk);
        System.out.println("Cache Memory: " + cache + " MB");
    }
}
