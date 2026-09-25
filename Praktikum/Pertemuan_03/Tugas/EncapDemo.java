package Tugas;

public class EncapDemo {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age > 30){
            System.out.println("Maaf, umur harus di bawah 30");
        }else if(age < 18){
            System.out.println("Maaf, umur harus di atas 18");
        }else{
            this.age = age;
        }
    }
}
