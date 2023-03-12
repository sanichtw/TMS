import AdditionalTasks.AdditionalTasks;
import Tasks.Tasks;

public class Main {
    public static void main(String[] args) {
        String documentNumber = "5555-abc-5678-qwe-1a2b";

        // Вывести на экран в одну строку два первых блока по 4 цифры.
        Tasks.printTheFirstTwoBlocks(documentNumber);
        System.out.println();

        // Вывести на экран номер документа, но блоки из трех букв заменить
        //на *** (каждая буква заменятся на *).
        Tasks.replaceBlocks(documentNumber);
        System.out.println();

        //Вывести на экран только одни буквы из номера документа в
        //формате yyy/yyy/y/y в нижнем регистре
        Tasks.printDocumentLettersInYFormat(documentNumber);
        System.out.println();

        // Вывести на экран буквы из номера документа в формате
        //"Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
        //класса StringBuilder)
        Tasks.printDocumentLetters(documentNumber);
        System.out.println();

        // Проверить содержит ли номер документа последовательность abc и
        //вывети сообщение содержит или нет(причем, abc и ABC считается
        //одинаковой последовательностью)
        Tasks.checkDocumentContainsSequence(documentNumber);
        System.out.println();

        // Проверить начинается ли номер документа с последовательности
        //555.
        Tasks.checkDocumentStartsWith(documentNumber);
        System.out.println();

        // Проверить заканчивается ли номер документа на
        //последовательность 1a2b.
        Tasks.checkDocumentEndsWith(documentNumber);
        System.out.println();


        ///////////////////////////////////////////
        // Дана строка произвольной длины с произвольными словами.
        //Найти самое короткое слово в строке и вывести его на экран.
        //Найти самое длинное слово в строке и вывести его на экран.
        //Если таких слов несколько, то вывести последнее из них.
        AdditionalTasks.findShortestAndLongestStrings("Hello! My name is Nikita. I'ssssssm 24 years old a");
        System.out.println();


        //Дана строка произвольной длины с произвольными словами.
        //Найти слово, в котором число различных символов минимально. Слово
        //может содержать буквы и цифры. Если таких слов несколько, найти первое
        //из них. Например, в строке "fffff ab f 1234 jkjk" найденное слово должно
        //быть "fffff"
        AdditionalTasks.findMinDistinctCharsWord("fffff ab f 1234 jkjk");
        System.out.println();


        //Дана строка произвольной длины с произвольными словами.
        //Написать программу для проверки является ли любое выбранное слово в
        //строке палиндромом.
        //Например, есть строка, вводится число 3, значит необходимо проверить
        //является ли 3-е слово в этой строке палиндромом.
        //Предусмотреть предупреждающие сообщения на случаи ошибочных
        //ситуаций: например, в строке 5 слов, а на вход программе передали число
        //500 и т. п. ситуации.
        AdditionalTasks.isPalindrome(
                "Мадам, казак и радар - это слова-палиндромы, которые " +
                        "читаются одинаково как слева направо, так и справа налево.",
                5);
        System.out.println();


        //Дана произвольная строка.
        //Вывести на консоль новую строку, которой задублирована каждая буква из
        //начальной строки.
        //Например, "Hello" -> "HHeelllloo".
        AdditionalTasks.duplicateStringCharacters("Nikita");
    }
}
