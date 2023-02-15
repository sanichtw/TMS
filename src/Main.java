import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //printANumber(); // 0. Создайте массив целых чисел. Напишете программу, которая выводит
        // сообщение о том, входит ли заданное число в массив или нет. Пусть
        // число для поиска задается с консоли (класс Scanner).

        //removeNumber(); // 1. Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
        // Пусть число задается с консоли (класс Scanner). Если такого числа нет - выведите сообщения об этом.
        // В результате должен быть новый массив без указанного числа.

        //findMaxMinAverageVal(); // 2. Создайте и заполните массив случайным числами и выведете
        // максимальное, минимальное и среднее значение. Для генерации случайного числа используйте метод Math.random().
        // Пусть будет возможность создавать массив произвольного размера. Пусть размер массива вводится с консоли.

        findTheLargestValue(); // 3. Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух
        // отдельных строках. Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого
        // из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).

        //createAndCheckArray(); // 4. Создайте массив из n случайных целых чисел и выведите его на экран. Размер массива пусть
        // задается с консолии размер массива может быть больше 5 и меньше или равно 10. Если n не удовлетворяет
        // условию - выведите сообщение об этом. Если пользователь ввёл не подходящее число, то программа должна
        // просить пользователя повторить ввод. Создайте второй массив только из чётных элементов первого массива,
        // если они там есть, и вывести его на экран.

        //replaceElWithOddIndex(); // 5. Создайте массив и заполните массив. Выведите массив на экран в строку.
        // Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.

        //sortArray(); // 6. Создайте массив строк. Заполните его произвольными именами людей. Отсортируйте массив.
        // Результат выведите на консоль.
    }



    // #0. Создайте массив целых чисел. Напишете программу, которая выводит
    // сообщение о том, входит ли заданное число в массив или нет. Пусть
    // число для поиска задается с консоли (класс Scanner).
    static void printANumber() {
        Scanner scanner = new Scanner(System.in);

        // filling the array with random numbers
        int[] arrayOfIntegers = new int[10];
        for(int i = 0; i < arrayOfIntegers.length; i++) {
            arrayOfIntegers[i] = new Random().nextInt(0, 11);
        }

        System.out.print("0. Enter any number from 0 to 10 to find out if the specified number is in the array: ");
        int randomInt = scanner.nextInt();
        boolean found = false;

        // finding a value
        for(int num: arrayOfIntegers) {
            if (num == randomInt) {
                found = true;
            }
        }

        // the result is output to the console
        System.out.println(Arrays.toString(arrayOfIntegers));
        System.out.printf("Value %s", (found ? "found" : "not found"));
        System.out.println();
        System.out.println("______________________");
    }



    // #1. Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
    // Пусть число задается с консоли (класс Scanner). Если такого числа нет - выведите сообщения об этом.
    // В результате должен быть новый массив без указанного числа.
    static void removeNumber() {
        Scanner scanner = new Scanner(System.in);

        // filling the array with random numbers
        int[] arrayOfIntegers = new int[10];
        int found = 0;

        for (int i = 0; i < arrayOfIntegers.length; i++) {
            arrayOfIntegers[i] = new Random().nextInt(0, 11);
        }
        System.out.println(Arrays.toString(arrayOfIntegers));
        System.out.print("1. Enter any number from 0 to 10 to delete all occurrences of a given number: ");

        int randomInt = scanner.nextInt();

        // finding a value
        for (int i = 0; i < arrayOfIntegers.length; i++) {
            if (randomInt == arrayOfIntegers[i]) {
                found++;
            }
        }

        // the result is output to the console
        int[] finalArray = new int[arrayOfIntegers.length - found];
        for (int i = 0, k = -1; i < arrayOfIntegers.length; i++) {
            if (randomInt != arrayOfIntegers[i]) {
                finalArray[++k] = arrayOfIntegers[i];
            }
        }

            System.out.println(Arrays.toString(finalArray));
            System.out.println("______________________");
    }



    // 2. Создайте и заполните массив случайным числами и выведете
    // максимальное, минимальное и среднее значение. Для генерации случайного числа используйте метод Math.random().
    // Пусть будет возможность создавать массив произвольного размера. Пусть размер массива вводится с консоли.
    static void findMaxMinAverageVal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("2. Enter the length of the array: ");
        int randomNum = scanner.nextInt();
        int minInt, maxInt;
        double average = 0.0;


        // filling the array with random numbers
        int[] arrayOfIntegers = new int[randomNum];
        for(int i = 0; i < arrayOfIntegers.length; i++) {
            arrayOfIntegers[i] = new Random().nextInt(0, 101);
            average += arrayOfIntegers[i];
        }
        Arrays.sort(arrayOfIntegers);
        System.out.println(Arrays.toString(arrayOfIntegers));


        // We find the minimum, maximum and average values
        minInt = arrayOfIntegers[0];
        maxInt = arrayOfIntegers[arrayOfIntegers.length - 1];
        average = average / arrayOfIntegers.length;
        System.out.printf("Min integer: %d, Max integer: %d, average: %f\n", minInt, maxInt, average);
        System.out.println("Array size " + arrayOfIntegers.length);
        System.out.println("______________________");
    }



    // 3. Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух
    // отдельных строках. Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого
    // из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).
    static void findTheLargestValue() {
        int[] firstArray, secondArray;
        int firstAverageValue = 0, secondAverageValue = 0;

        firstArray = new int[5];
        secondArray = new int[5];

        // filling in arrays
        for(int i = 0; i < firstArray.length; i++) {
            firstArray[i] = new Random().nextInt(0, 11);
            firstAverageValue += firstArray[i];
            secondArray[i] = new Random().nextInt(0, 11);;
            secondAverageValue += secondArray[i];
        }

        // the result is output to the console
        double firstArithmeticMean = (double) firstAverageValue / firstArray.length;
        double secondArithmeticMean = (double) secondAverageValue / secondArray.length;
        System.out.printf("First array: %s", Arrays.toString(firstArray));
        System.out.println();
        System.out.printf("Second Array: %s", Arrays.toString(secondArray));
        System.out.println();
        System.out.println("Arithmetic mean of the first array: " + firstArithmeticMean);
        System.out.println("Arithmetic mean of the second array: " + secondArithmeticMean);
        System.out.println(firstArithmeticMean > secondArithmeticMean ?
                "The arithmetic mean of the first array is greater than the second" :
                "The arithmetic mean of the second array is greater than the first");
        System.out.println("______________________");
    }



    // 4. Создайте массив из n случайных целых чисел и выведите его на экран. Размер массива пусть задается с консоли
    // и размер массива может быть больше 5 и меньше или равно 10. Если n не удовлетворяет условию - выведите
    // сообщение об этом. Если пользователь ввёл не подходящее число, то программа должна просить пользователя
    // повторить ввод. Создайте второй массив только из чётных элементов первого массива, если они там есть,
    // и вывести его на экран.
    static void createAndCheckArray() {
        int num = enterAnInteger();
        int[] array = new int[num];
        ArrayList<Integer> evenArray = new ArrayList<>();

        // fill in the array and check for parity
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            if (array[i] % 2 == 0) evenArray.add(array[i]);
        }

        // the result is output to the console
        if (evenArray.size() > 0) {
            System.out.println(evenArray);
        } else {
            System.out.println("There are no even numbers in the array");
        }
        System.out.println("______________________");
    }

    // Support function 4 tasks for entering a number.
    static int enterAnInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer from 6 to 10: ");
        int num = scanner.nextInt();

        // check the correctness of the entered number
        if (num <= 5 || num > 10) {
            System.out.println("The number does not satisfy the condition. Try again.");
            return enterAnInteger();
        } else {
            scanner.close();
            return num;
        }

    }



    // 5. Создайте массив и заполните массив. Выведите массив на экран в строку.
    // Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.
    static void replaceElWithOddIndex() {
        int[] array = {1, 1, 2, 3, 4, 5, 7, 9};
        System.out.println(Arrays.toString(array));

        for (int i = 0 ; i < array.length; i++) {
            if ((i % 2 != 0)) array[i] = 0;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("______________________");
    }


    // 6. Создайте массив строк. Заполните его произвольными именами людей. Отсортируйте массив.
    // Результат выведите на консоль.
    static void sortArray() {
        String[] names = {"Nikita", "Dasha", "Angelina", "Archil", "Egor"};
        Arrays.sort(names);

        System.out.println(Arrays.toString(names));
        System.out.println("______________________");
    }
}