public class Main {
    public static void main(String[] args) {
        String documentNumber = "1234-abc-5678-qwe-9x0w";

        // Вывести на экран в одну строку два первых блока по 4 цифры.
        printTheFirstTwoBlocks(documentNumber);

        // Вывести на экран номер документа, но блоки из трех букв заменить
        //на *** (каждая буква заменятся на *).
        replaceBlocks(documentNumber);

        //Вывести на экран только одни буквы из номера документа в
        //формате yyy/yyy/y/y в нижнем регистре
        printDocumentLettersInYFormat(documentNumber);
    }

    private static void printTheFirstTwoBlocks(String documentNumber) {
        System.out.print(documentNumber.substring(0, 4));
        System.out.print(documentNumber.substring(9, 13));
        System.out.println();
    }

    private static void replaceBlocks(String documentNumber) {
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

    private static void printDocumentLettersInYFormat(String documentNumber) {
        // Works with any string
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
}
