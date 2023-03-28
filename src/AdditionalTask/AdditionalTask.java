package AdditionalTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class AdditionalTask {
    public static void task2() {
        ArrayList<String> studentNames = new ArrayList<>(
                Arrays.asList(
                        "Nikita",
                        "Egor",
                        "Kiril",
                        "Ilona",
                        "Nikita",
                        "Igor",
                        "Artem",
                        "Nikolay",
                        "Alexandr",
                        "Gor",
                        "Sergey"));

        System.out.println("Вернуть количество количество людей с вашим именем " +
                "(вне зависимости от верхнего/нижнего регистра букв)");
        System.out.println(studentNames.stream()
                .filter(n -> n.equalsIgnoreCase("nikita"))
                .count()
        );

        System.out.println("- Выбрать все имена, начинающиеся на \"а\" " +
                "(вне зависимости от верхнего/нижнего регистра букв)");
        System.out.println(studentNames.stream()
                .map(n -> n.split(""))
                .filter(n -> n[0].equalsIgnoreCase("a"))
                .map(n -> n.toString())
                .collect(Collectors.toList()));
    }
}
