package HomeWork07;

public class Triangle extends Figure{

    public Triangle(int ... sides) {
        super(sides);
    }

    @Override
     public double getArea() {
        int[] triangleSides = getSides();
        double sp = getSemiPerimeter(triangleSides);
        return Math.sqrt(sp*(sp - triangleSides[0]*(sp - triangleSides[1]*(sp - triangleSides[2]))));
    }

    public double getSemiPerimeter(int[] triangleSides) {
        double semiPerimeter = 0;
        for (int s: triangleSides) semiPerimeter += s;
        return semiPerimeter;
    }
}
