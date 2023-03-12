package AdditionalTasks;

public class AdditionalTasks {
    //Дана строка произвольной длины с произвольными словами.
    //Найти самое короткое слово в строке и вывести его на экран.
    //Найти самое длинное слово в строке и вывести его на экран.
    //Если таких слов несколько, то вывести последнее из них.
    public static void findShortestAndLongestStrings(String str) {
        String shortestString, longestString;
        String[] splittedString = str.split(" ");
        shortestString = splittedString[0];
        longestString = splittedString[0];

        for (int i = 1; i < splittedString.length; i++) {
            if (shortestString.length() >= splittedString[i].length()) {
                shortestString = splittedString[i];
            } else if (longestString.length() <= splittedString[i].length()) {
                longestString = splittedString[i];
            }
        }

        System.out.println(shortestString);
        System.out.println(longestString);
    }

    //Дана строка произвольной длины с произвольными словами.
    //Найти слово, в котором число различных символов минимально. Слово
    //может содержать буквы и цифры. Если таких слов несколько, найти первое
    //из них. Например, в строке "fffff ab f 1234 jkjk" найденное слово должно
    //быть "fffff"

    public static void findMinDistinctCharsWord(String str) {}


    //Дана строка произвольной длины с произвольными словами.
    //Написать программу для проверки является ли любое выбранное слово в
    //строке палиндромом.
    //Например, есть строка, вводится число 3, значит необходимо проверить
    //является ли 3-е слово в этой строке палиндромом.
    //Предусмотреть предупреждающие сообщения на случаи ошибочных
    //ситуаций: например, в строке 5 слов, а на вход программе передали число
    //500 и т. п. ситуации.
    public static void isPalindrome(String str, int number) {
        String[] splittedString = str.split(" ");
        if (number > splittedString.length) throw new ArrayIndexOutOfBoundsException("Cтрока с таким номером не найдена");

        StringBuilder reversedStr = new StringBuilder(splittedString[number]);

        System.out.println(splittedString[number].equals(reversedStr.reverse().toString()) ?
                "Строка \"" + splittedString[number] + "\" является палиндром" :
                "Строка \"" + splittedString[number] + "\" не является палиндром");
    }


    //Дана произвольная строка.
    //Вывести на консоль новую строку, которой задублирована каждая буква из
    //начальной строки.
    //Например, "Hello" -> "HHeelllloo".
    public static void duplicateStringCharacters(String str) {
        String[] splittedString = str.split("");
        StringBuilder sb = new StringBuilder("");

        for (String el : splittedString) {
            sb.append(el).append(el);
        }

        System.out.println(sb);
    }
}
