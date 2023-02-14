import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //increaseArrayElements(); // 1
        //crossTheChessBoard(); // 2
        //getSumOfAllElements(); // 4
        //outputDiagonals(); // 5
        //sortTwoDimMassive(); // 6
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
        String[] sourceArray = {"W", "B", "W", "B", "W", "B", "W", "B"};
        String[] reverseArray = {"B", "W", "B", "W", "B", "W", "B", "W" };
        String[][] finalArray = new String[8][8];

        for(int x = 0; x < finalArray.length; x++) {
            for(int y = 0; y < finalArray[x].length; y++) {
                if (x % 2 == 0) {
                    finalArray[x][y] = sourceArray[y];
                } else {
                    finalArray[x][y] = reverseArray[y];
                }
            }
            System.out.println(Arrays.toString(finalArray[x]));
        }
    }


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
}


