import HomeWork07.Circle;
import HomeWork07.Figure;
import HomeWork07.Rectangle;
import HomeWork07.Triangle;

public class Main {
    // Task 1
    public static void main(String[] args) {
        Figure[] figures = {new Triangle(40, 20, 30),
                            new Rectangle(15, 5, 15, 5),
                            new Circle(8.5),
                            new Circle(22),
                            new Rectangle(22, 15, 22, 15)
        };
        int sumOfAllPerimeters = 0;
        int sumOfAllAreas = 0;

        for (Figure f: figures) {
            sumOfAllPerimeters += f.getPerimeter();
            sumOfAllAreas += f.getArea();
        }
        System.out.println("Sum of all perimeters: " + sumOfAllPerimeters);
        System.out.println("Sum of all areas: " + sumOfAllAreas);
    }

    // Task 2
}
