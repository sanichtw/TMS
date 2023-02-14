import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        increaseArrayElements();
        crossTheChessBoard();
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
}


