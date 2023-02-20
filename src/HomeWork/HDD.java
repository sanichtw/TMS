package HomeWork;

public class HDD {
    public String name;
    public String type;
    public int capacity;


    public HDD() {
        this.name = "Unknown";
        this.type = "Unknown";
        this.capacity = 0;
    }

    public HDD (String name, String type, int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }

    public void getFullInfoHDD() {
        System.out.println("HDD name: " + this.name + ", HDD capacity: " + this.capacity + ", HDD type: " + this.type);
    }
}
