package HomeWork07;

public class Rectangle extends  Figure{
    public Rectangle(int ... sides) {
        super(sides);
    }

    @Override
    public double getArea() {
        int[] rectangleSides = getSides();
        return rectangleSides[0] * rectangleSides[1];
    }
}
