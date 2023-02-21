package HomeWork07;

public class Figure {
    private double perimeter = 0;
    private double area = 0;
    private double radius = 0;
    private int[] sidesLength = new int[4];

    public Figure(int ... sides) {
        System.arraycopy(sides, 0, sidesLength, 0, sides.length);
    }

    public int[] getSides() {
        return this.sidesLength;
    }

    public double getPerimeter() {
        for(int side : sidesLength) this.perimeter += side;
        return this.perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
