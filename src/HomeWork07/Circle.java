package HomeWork07;

public class Circle extends Figure{
    public Circle(double radius) {
        setRadius(radius);
    }

    @Override
    public double getPerimeter() {
        return (2 * 3.14 * getRadius());
    }

    @Override
    public double getArea() {
        return (3.14 * Math.pow(getRadius(), 2));
    }
}
