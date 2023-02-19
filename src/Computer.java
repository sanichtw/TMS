public class Computer {
    public double price;
    public String model;
    public RAM ram;
    public HDD hdd;

    public Computer (double price, String model) {
        this.price = price;
        this.model = model;
        this.ram = new RAM();
        this.hdd = new HDD();
    }

    public Computer(double price, String model, RAM ram, HDD hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    public void getFullInfo() {
        System.out.println("Model: " + this.model + ", price: " + price);

        ram.getFullInfoRAM();
        hdd.getFullInfoHDD();
    }
}
