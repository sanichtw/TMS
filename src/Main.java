import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //printANumber(); // #0. Создайте массив целых чисел. Напишете программу, которая выводит
        // сообщение о том, входит ли заданное число в массив или нет. Пусть
        // число для поиска задается с консоли (класс Scanner).

        //removeNumber(); // #1. Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
        // Пусть число задается с консоли (класс Scanner). Если такого числа нет - выведите сообщения об этом.
        // В результате должен быть новый массив без указанного числа.

        findMaxMinAverageVal(); // 2. Создайте и заполните массив случайным числами и выведете
        // максимальное, минимальное и среднее значение. Для генерации случайного числа используйте метод Math.random().
        // Пусть будет возможность создавать массив произвольного размера. Пусть размер массива вводится с консоли.
    }


    // #0. Создайте массив целых чисел. Напишете программу, которая выводит
    // сообщение о том, входит ли заданное число в массив или нет. Пусть
    // число для поиска задается с консоли (класс Scanner).
    static void printANumber() {
        Scanner scanner = new Scanner(System.in);

        // filling the array with random numbers
        int[] arrayOfIntegers = new int[10];
        for(int i = 0; i < arrayOfIntegers.length; i++) {
            arrayOfIntegers[i] = (int) (Math.random() * 10);
        }

        System.out.print("Введите любое число от 0 до 10: ");
        int randomInt = scanner.nextInt();
        boolean found = false;

        // finding a value
        for(int num: arrayOfIntegers) {
            if (num == randomInt) {
                found = true;
            }
        }

        // the result is output to the console
        System.out.printf("Value %s", (found ? "found" : "not found"));
        System.out.println();
    }


    // #1. Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
    // Пусть число задается с консоли (класс Scanner). Если такого числа нет - выведите сообщения об этом.
    // В результате должен быть новый массив без указанного числа.
    static void removeNumber() {
        Scanner scanner = new Scanner(System.in);

        // filling the array with random numbers
        int[] arrayOfIntegers = new int[10];
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < arrayOfIntegers.length; i++) {
            arrayOfIntegers[i] = (int) (Math.random() * 10);
        }

        System.out.print("Введите любое число от 0 до 10: ");
        int randomInt = scanner.nextInt();

        // finding a value
        for(int i = 0; i < arrayOfIntegers.length; i++) {
            if (randomInt != arrayOfIntegers[i]) {
                arrayList.add(arrayOfIntegers[i]);
            }
        }
        // the result is output to the console
        if (arrayList.size() < arrayOfIntegers.length) {
            System.out.println(arrayList);
        } else {
            System.out.println("There is no such number");
        }
    }


    // 2. Создайте и заполните массив случайным числами и выведете
    // максимальное, минимальное и среднее значение. Для генерации случайного числа используйте метод Math.random().
    // Пусть будет возможность создавать массив произвольного размера. Пусть размер массива вводится с консоли.
    static void findMaxMinAverageVal() {
        Scanner scanner = new Scanner(System.in);

        // filling the array with random numbers
        int randomValue = (int) (Math.random() * 100);
        int[] arrayOfIntegers = new int[randomValue];
        for(int i = 0; i < arrayOfIntegers.length; i++) {
            arrayOfIntegers[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(arrayOfIntegers));



        System.out.printf("Array size %d: ",arrayOfIntegers.length);
    }

}