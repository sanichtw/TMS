package HomeWork07;

public class Figure {
    private int perimeter = 0;
    private double area = 0;

    public Figure(int ... sides) {
    }

    public int calculatePerimeter(int ... sideLength) {
        for(int side : sideLength) this.perimeter += side;
        return this.perimeter;
    }

    public int getSumOfPerimetersAndAreas(double ... values) {

        return 5;
    }
}
