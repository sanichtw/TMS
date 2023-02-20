package HomeWork;

public class RAM {
    public String name;
    public int capacity;

    RAM () {
        this.name = "Unknown";
        this.capacity = 0;
    }

    public RAM (String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void getFullInfoRAM() {
        System.out.println("RAM name: " + this.name + ", RAM capacity: " + this.capacity);
    }
}
