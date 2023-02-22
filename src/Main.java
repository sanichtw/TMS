import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //increaseArrayElements(); // 1 Создать двухмерный массив из целых чисел. С помощью циклов "пройти" по
        // всему массиву и увеличить каждый элемент на заданное число. Пусть число, на которое будет
        // увеличиваться каждый элемент, задается из консоли.

        crossTheChessBoard(); // 2 Шахматная доска

        //multiplicationTwoArrays(); // 3 Умножение двух матриц

        //getSumOfAllElements(); // 4 Создайте двумерный массив целых чисел. Выведите на консоль сумму
        // всех элементов массива.

        //outputDiagonals(); // 5 Создайте двумерный массив. Выведите на консоль диагонали массива.

        //sortTwoDimMassive(); // 6 Создайте двумерный массив целых чисел. Отсортируйте элементы в строках двумерного
        // массива по возрастанию.

        //guessWord(); // game
    }


    static void increaseArrayElements() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        int[][] firstArray = {
                {1, 3, 5, 7},
                {2, 4, 6, 8}
        };
        for(int i = 0; i < firstArray.length; i++) {
            for(int y = 0; y < firstArray[i].length; y++) {
                firstArray[i][y] += num;
            }
            System.out.println(Arrays.toString(firstArray[i]));
        }
    }


    static void crossTheChessBoard() {
        char[][] finalArray = new char[8][8];
        char[] chars = {'W', 'B'};

        for(int x = 0; x < finalArray.length; x++) {
            for(int y = 0; y < finalArray[x].length; y++) {
                if ((x % 2 == 0 && y % 2 == 0) || (x % 2 != 0 && y % 2 != 0)) {
                    finalArray[x][y] = chars[0];
                } else if ((x % 2 == 0 && y % 2 != 0) || (x % 2 != 0 && y % 2 == 0)) {
                    finalArray[x][y] = chars[1];
                }
            }
            System.out.println(Arrays.toString(finalArray[x]));
        }
    }

    /* static void multiplicationTwoArrays() {
        int[][] firstArray = {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}
        };
        int[][] secondArray = {
                {1, 2, 3},
                {1, 1, 1},
                {0, 0, 0},
                {2, 1, 0}
        };
        int[][] finalArray = new int[3][3];

        for (int r = 0; r < firstArray.length; r++) {
            for (int c = 0; c < secondArray[r].length; c++) {
                for (int f = 0; f < finalArray[r].length; f++) {
                    finalArray[r][f] += firstArray[r][c] * secondArray[c][f];
                }
            }
        }
        System.out.println(Arrays.deepToString(finalArray));
    }  */


    static void getSumOfAllElements() {
        int[][] array = {
                {1, 2, 3, 5},
                {8, 11, 10, -5}
        };
        int sum = 0;

        for (int[] ints : array) {
            for (int y = 0; y < ints.length; y++) {
                sum += ints[y];
            }
        }
        System.out.println(sum);
    }

    static void outputDiagonals() {
        int[][] array = {
                {1, 2, 3, 4, 6, 8, 9, 0},
                {1, 2, 3, 5, 7, 9, 1, 8},
                {1, 2, 3, 1, 2, 3, 2, 1},
                {1, 2, 3, 1, 2, 3, 5, 8},
                {1, 2, 3, 1, 2, 3, 0, 1},
                {1, 2, 3, 1, 2, 3, 2, 1},
                {1, 2, 3, 1, 2, 3, 2, 1},
                {1, 2, 3, 1, 2, 3, 2, 1}
        };
        int[] firstDiagonal = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for(int y = i; ; ) {
                firstDiagonal[i] = array[i][y];
                break;
            }
        }
        System.out.println(Arrays.toString(firstDiagonal));

        int[] secondDiagonal = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for(int y = array[i].length-1 - i; ;) {
                secondDiagonal[i] = array[i][y];
                break;
            }
        }
        System.out.println(Arrays.toString(secondDiagonal));
    }

    static void sortTwoDimMassive() {
        int[][] array = {
                {1, 10, 9, 200, 11, 0, 16},
                {2, 101, -1, 11, 11, 1, 22},
        };

        for (int[] ints : array) {
            Arrays.sort(ints);
            System.out.println(Arrays.toString(ints));
        }
    }

    static void guessWord() {
        String[] words = new String[] {
          "America",
          "Minsk",
          "Apple",
          "Android",
          "Tennis",
          "Java",
          "Temperature",
          "Word",
          "Microsoft",
          "Window"
        };

        int randomNum = new Random().nextInt(words.length);
        String randomWord = words[randomNum];
        String[] hiddenWord = new String[randomWord.length()];
        Arrays.fill(hiddenWord, "*");


        System.out.println("The game has started");
        String guessedWord = enterAValue(randomWord, hiddenWord);
        System.out.println("You guessed the word! It's " + guessedWord);
    }

    static String enterAValue(String randomWord, String[] hiddenWord) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hiddenWord: " + Arrays.toString(hiddenWord));
        System.out.print("Enter a letter or a word: ");
        String enteredValue = scanner.next();
        if (enteredValue.length() == 1) {
            char[] arrayChars = randomWord.toLowerCase().toCharArray();
            for (int i = 0; i < arrayChars.length; i++) {
                if (enteredValue.toLowerCase().charAt(0) == arrayChars[i]) {
                    hiddenWord[i] = String.valueOf(arrayChars[i]);
                }
            }
        } else if (enteredValue.length() > 1 && enteredValue.toLowerCase().equals(randomWord.toLowerCase())) {
            return randomWord;
        } else if (enteredValue.length() > 1 && !enteredValue.toLowerCase().equals(randomWord.toLowerCase())) {
            System.out.println("Unfortunately, the word is incorrect. Try again.");
            return enterAValue(randomWord, hiddenWord);
        }
        return Arrays.asList(hiddenWord).contains("*") ? enterAValue(randomWord, hiddenWord) : randomWord;
    }
}


