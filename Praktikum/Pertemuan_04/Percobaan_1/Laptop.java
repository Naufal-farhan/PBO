public class Laptop {
    private String merk;
    private Processor proc;

    public Laptop(String merk, Processor proc) {
        this.merk = merk;
        this.proc = proc;
    }
    public Laptop() {
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getMerk() {
        return merk;
    }
    public Processor getProcessor() {
        return proc;
    }
    public void setProcessor(Processor proc) {
        this.proc = proc;
    }
    public void info() {
        System.out.println("Merk Laptop: " + merk);
        proc.info();
    }
}