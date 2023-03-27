package PartTwo;

import java.util.ArrayList;
import java.util.Random;

public class PartTwo {

    // 1.
    public static void task1() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            arrayList.add(random.nextInt(21));
        }
        System.out.println(arrayList);
        System.out.println(arrayList.stream().distinct());
    }
}
