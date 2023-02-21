package HomeWork07;

public class Car {
    final String model;
    private String color;
    final int productionYear;
    private int maxSpeed;

    public Car(String model, String color, int productionYear, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getProductionYear() {
        return productionYear;
    }
    public String getModel() { return model; }
}
