package Tasks;

public class Tasks {
    // Вывести на экран в одну строку два первых блока по 4 цифры.
    public static void printTheFirstTwoBlocks(String documentNumber) {
        System.out.print(documentNumber.substring(0, 4));
        System.out.print(documentNumber.substring(9, 13));
        System.out.println();
    }

    // Вывести на экран номер документа, но блоки из трех букв заменить
    //на *** (каждая буква заменятся на *).
    public static void replaceBlocks(String documentNumber) {
        String[] blocks = documentNumber.split("-");
        StringBuilder replacedString = new StringBuilder();

        for (int i = 0; i < blocks.length; i++) {
            if (i % 2 != 0 && i != blocks.length - 1) {
                replacedString.append("-***-");
            } else {
                replacedString.append(blocks[i]);
            }
        }
        System.out.println(replacedString);
    }

    //Вывести на экран только одни буквы из номера документа в
    //формате yyy/yyy/y/y в нижнем регистре
    public static void printDocumentLettersInYFormat(String documentNumber) {
        char[] charsArray = documentNumber.toCharArray();
        int counter = 0;
        StringBuilder replacedString = new StringBuilder();

        for (int i = 0; i < charsArray.length; i++) {
            char ch = charsArray[i];
            char nextChar = charsArray[counter < charsArray.length - 1 ? ++counter : counter];
            if (Character.isLetter(ch) && i != charsArray.length - 1 && !Character.isLetter(nextChar)) {
                replacedString.append(ch).append("/");
            } else if (Character.isLetter(ch) && i != charsArray.length - 1 && Character.isLetter(nextChar)){
                replacedString.append(ch);
            } else if (Character.isLetter(ch) && i == charsArray.length - 1) {
                replacedString.append(ch);
            }
        }
        System.out.println(replacedString);
    }

    // Вывести на экран буквы из номера документа в формате
    //"Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
    //класса StringBuilder)
    public static void printDocumentLetters(String documentNumber) {
        char[] charsArray = documentNumber.toCharArray();
        int counter = 0;
        StringBuilder replacedString = new StringBuilder();

        for (int i = 0; i < charsArray.length; i++) {
            char ch = charsArray[i];
            char nextChar = charsArray[counter < charsArray.length - 1 ? ++counter : counter];
            if (Character.isLetter(ch) && i != charsArray.length - 1 && !Character.isLetter(nextChar)) {
                replacedString.append(ch).append("/");
            } else if (Character.isLetter(ch) && i != charsArray.length - 1 && Character.isLetter(nextChar)){
                replacedString.append(ch);
            } else if (Character.isLetter(ch) && i == charsArray.length - 1) {
                replacedString.append(ch);
            }
        }
        System.out.println("Letters: " + replacedString.toString().toUpperCase());
    }

    // Проверить содержит ли номер документа последовательность abc и
    //вывети сообщение содержит или нет(причем, abc и ABC считается
    //одинаковой последовательностью)
    public static void checkDocumentContainsSequence(String documentNumber) {
        System.out.println(documentNumber.toLowerCase().contains("abc"));
    }

    // Проверить начинается ли номер документа с последовательности
    //555.
    public static void checkDocumentStartsWith(String documentNumber) {
        System.out.println(documentNumber.startsWith("555"));
    }

    // Проверить заканчивается ли номер документа на
    //последовательность 1a2b.
    public static void checkDocumentEndsWith(String documentNumber) {
        System.out.println(documentNumber.endsWith("1a2b"));
    }
}
