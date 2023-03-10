import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        checkNumber(scanner); //  №1. Вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.

        doesATriangleExist(scanner); // №2. Определить существует ли такой треугольник.

        incrementOrDecrementInt(scanner); // №3. Дано целое число. Если оно является положительным, то прибавить к нему 1.
        // Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на10. Вывести полученное число.

        findPositiveIntegers(scanner); // №4. Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.

        countTheNegativeAndPositiveInt(scanner); // №5. Даны 3 целых числа. Найти количество положительных и отрицательных чисел
        // в исходном наборе.

        printALargerNumber(scanner); // №6. Даны 2 числа. Вывести большее из них.

        countProgrammes(scanner); // №7. В зависимости от количества программистов необходимо вывести правильно окончание.
    }


     // №1. Вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
    static void checkNumber(Scanner sc) {
        System.out.print("№1. Enter a number to find out how many digits it has and whether it is positive: ");
        int num = sc.nextInt();
        System.out.println(num);

        if (num < 0) {
            System.out.println("This is a negative number");
        } else if (num > 0 && num < 10) {
            System.out.println("This is a single-digit positive number");
        } else if (num >= 10 && num < 100) {
            System.out.println("This is a two-digit positive number");
        } else if (num >= 100 && num < 200) {
            System.out.println("This is a three-digit positive number");
        } else System.out.println("This is a multi-digit positive number");
    }


    // №2. Определить существует ли такой треугольник
    static void doesATriangleExist(Scanner sc) {
        System.out.print("№2. Enter three number to determine if such a triangle exists: ");
        int sideA = sc.nextInt();
        int sideB = sc.nextInt();
        int sideC = sc.nextInt();
        if ((sideA >= sideB + sideC) || (sideB >= sideA + sideC) || (sideC >= sideA + sideB)) {
            System.out.println("There is no such triangle");
        } else {
            System.out.println("Such a triangle exists");
        }
    }


    // №3. Дано целое число. Если оно является положительным, то прибавить к нему 1.
    // Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на 10. Вывести полученное число.
    static void incrementOrDecrementInt(Scanner sc) {
        System.out.print("№3. Enter an integer: ");
        int number = sc.nextInt();

        if (number > 0) {
            number++;
            System.out.println(number);
        } else if (number < 0) {
            number -= 2;
            System.out.println(number);
        } else {
            number = 10;
            System.out.println(number);
        }
    }


    // №4. Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
    static void findPositiveIntegers(Scanner sc) {
        System.out.print("№4. Enter 3 positive integers to find the positive ones: ");
        int[] nums = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int positiveNums = 0;

        for (int num : nums) {
            if (num >= 0) {
                positiveNums++;
            }
        }
        System.out.println("Количество положительных чисел: " + positiveNums);
    }


    // №5. Даны 3 целых числа. Найти количество положительных и отрицательных чисел
    // в исходном наборе.
    static void countTheNegativeAndPositiveInt(Scanner sc) {
        System.out.print("№5. Enter 3 integers to find the number of positive and negative: ");
        int[] nums = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int positiveNums, negativeNums;
        positiveNums = negativeNums = 0;

        for (int num : nums) {
            if (num >= 0) {
                positiveNums++;
            } else {
                negativeNums++;
            }
        }
        System.out.printf("Количество положительных чисел: %d, " +
                "количество отрицательных чисел: %d", positiveNums, negativeNums);
        System.out.println();
    }


    // №6. Даны 2 числа. Вывести большее из них
    static void printALargerNumber(Scanner sc) {
        System.out.print("№6. Enter 2 integers to find the larger one: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.printf("Наибольшее значение: %d", (num1 >= num2 ? num1 : num2));
        System.out.println();
    }


    // №7. В зависимости от количества программистов необходимо вывести правильно окончание
    static void countProgrammes(Scanner sc) {
        System.out.print("№7. Enter the number of programmers: ");
        String num = sc.next();
        char[] chars = {'2', '3', '4'};

        if ((num.length() >= 3 && num.substring(num.length() - 2).equals("01")) ||
                (num.length() == 1 && num.equals("1")) ||
                (num.length() > 1 && num.substring(num.length() - 1).equals("1"))) {
                    System.out.println(num + " программист");
        } else if (num.length() >= 1) {
            for (char ch : chars) {
                if (num.charAt(num.length()-1) == ch) {
                    System.out.println(num + " программиста");
                    break;
                } else {
                    System.out.println(num + " программистов");
                    break;
                }
            }
        }

    }
}
