package AdditionalTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class AdditionalTask {
    public static void additional() {
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
                .filter(n -> n.substring(0, 1).equalsIgnoreCase("a"))
                .collect(Collectors.toList())
        );


        System.out.println("\n- Отсортировать и вернуть первый элемент коллекции или" +
                "\"Empty@, если коллекция пуста");
        System.out.println(studentNames.stream().sorted().findFirst());
    }
}
