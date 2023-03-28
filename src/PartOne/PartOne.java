package PartOne;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.function.Consumer;

public class PartOne {

    public static void partOne() {
        // 1. Написать программу для вывода на консоль названия дня недели по введенной дате.
        getDate(new Date(2023-1900, 03, 01));

        // 2. Написать программу для вывода на экран дату следующего вторника.
        getDateOfNextTuesday();

        // 3.
        practice("text");
    }

    // 1. Написать программу для вывода на консоль названия дня недели по введенной дате.
    public static void getDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(sdf.format(date));

        String day = new SimpleDateFormat("EEEE").format(date);
        System.out.println("Day Name: " + day);
    }

    // 2. Написать программу для вывода на экран дату следующего вторника.
    public static void getDateOfNextTuesday() {
        int dayOfWeek = 3;
        Calendar dateNow = Calendar.getInstance();
        int weekDay = dateNow.get(Calendar.DAY_OF_WEEK);

        int days = dayOfWeek - weekDay;
        if (days < 0) days += 7;
        dateNow.add(Calendar.DAY_OF_WEEK, days);

        Date date = dateNow.getTime();
        String dateStr = new SimpleDateFormat("dd-MM-yyyy").format(date);
        System.out.println(dateStr);
    }

    // 3
    public static void practice(String txt) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1 или 2");
        int number = sc.nextInt();

        Consumer<Integer> consumer = num -> {
            if (num == 1) {
                System.out.println(new StringBuilder(txt).reverse());
            } else if (num == 2) {
                int factorial = 1;
                for (int i = 1; i <= txt.length(); i++) {
                    factorial = factorial * i;
                }
                System.out.println(factorial);
            }
        };
        consumer.accept(number);
    }
}
