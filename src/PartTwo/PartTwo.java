package PartTwo;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;

public class PartTwo {

    // 1.
    public static void partTwo() {
        ArrayList<Integer> randomNumbers = new ArrayList<>();

        System.out.println("Удалить дубликаты");
        for (int i = 0; i < 15; i++) {
            randomNumbers.add(new Random().nextInt(21));
        }
        System.out.println(randomNumbers);
        System.out.println(randomNumbers.stream().distinct().collect(Collectors.toList()));


        System.out.println("\nВывести все четные элементы в диапазоне от 7 до 17 (включительно)");
        System.out.println(randomNumbers
                .stream()
                .filter(i -> i >= 7 && i <= 17 && i % 2 == 0)
                .collect(Collectors.toList()));


        System.out.println("\nКаждый элемент умножить на 2");
        System.out.println(randomNumbers
                .stream()
                .map(i -> i * 2)
                .collect(Collectors.toList())
        );


        System.out.println("\nОтсортировать и вывести на экран первых 4 элемента");
        System.out.println(randomNumbers.stream().limit(4).collect(Collectors.toList()));


        System.out.println("\nВывести количество элементов в стриме");
        System.out.println(randomNumbers.stream().count());

        System.out.println("\nВывести среднее арифметическое всех чисел в стриме");
        int count = randomNumbers.stream().reduce(Integer::sum).orElse(0);
        System.out.println(count / randomNumbers.size());

    }
}
