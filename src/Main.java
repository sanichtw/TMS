import HomeWork07.*;

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
        System.out.println();


        // Task 2
        Car[] cars = {new Car("BWM", "Black", 2005, 250),
                new Car("Audi", "White", 2012, 312),
                new Car("Mazda", "Black", 1999, 240),
                new Car("KIA", "Red", 2008, 280),
        };

        Car[] cars2 = {new Car("Opel", "Blue", 1992, 200),
                new Car("Reno", "Grey", 2002, 240),
                new Car("Daewoo", "Black", 1989, 180),
                new Car("Mercedes", "Grey", 2015, 300),
        };

        Car oldest = cars[0];
        Car fastest = cars[0];

        for (int i = 1; i < cars.length; i++) {
            if (cars[i].getProductionYear() < oldest.getProductionYear()) {
                oldest = cars[i];
            }
            if (cars[i].getMaxSpeed() > fastest.getMaxSpeed()) {
                fastest = cars[i];
            }
        }

        for (int i = 1; i < cars2.length; i++) {
            if (cars2[i].getProductionYear() < oldest.getProductionYear()) {
                oldest = cars2[i];
            }
            if (cars2[i].getMaxSpeed() > fastest.getMaxSpeed()) {
                fastest = cars2[i];
            }
        }

        System.out.println("The oldest car is " + oldest.getModel() + ", production year: " +
                oldest.getProductionYear());

        System.out.println("The fastest car is " + fastest.getModel() + ", max speed: " +
                fastest.getMaxSpeed());
    }





}
