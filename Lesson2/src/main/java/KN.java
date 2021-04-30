import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class KN {
    private static char [][] map;
    private static final int SIZE = 3;
    private static final char EMPTY = '-';
    private static final char X_DOT = 'x';
    private static final char O_DOT = 'o';
    private static Scanner sc;

    public static void main(String[] args) {
        initGame();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            System.out.println();
            if (checkwin(X_DOT)) {
                System.out.println("You win");
                break;
            }
            if (checkDraw()) {
                System.out.println("Draw");
                break;
            }

            computerTurn();
            printMap();
            System.out.println();
            if (checkwin(O_DOT)) {
                System.out.println("You lost");
                break;
            }
            if (checkDraw()) {
                System.out.println("Draw");
                break;
            }
            try {
                Thread.sleep(300);
            } catch (InterruptedException ignored) {
            }
            System.out.println();
        }
        }
    private static boolean checkDraw () {
        for (char[] chars : map) {
            for (char aChar : chars) {
                if (aChar == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkwin(char c) {
        int countV;
        int countH;
        int countDiagonalA = 0;
        int countDiagonalB = 0;
        for (int i = 0; i <= SIZE - 1; i++) {
            countH = 0;
            countV = 0;
            for (int j = 0; j <= SIZE - 1; j++) {
                if (map[i][j] == c) {
                    countH++;
                    if (countH == SIZE) return true;
                }

                if (map[j][i] == c) {
                    countV++;
                    if (countV == SIZE) return true;
                }
            }
            if (map[i][i] == c) {
                countDiagonalA++;
                if (countDiagonalA == SIZE) return true;
            } else countDiagonalA = 0;

            if (map[i][SIZE - 1 - i] == c) {
                countDiagonalB++;
                if (countDiagonalB == SIZE) return true;
            } else countDiagonalB = 0;
        }
        return false;
    }

    private static void computerTurn() {
        int xCoordinate;
        int yCoordinate;
        do {
            Random random = new Random();
            xCoordinate = random.nextInt(SIZE);
            yCoordinate = random.nextInt(SIZE);
        } while (!isValidCell(xCoordinate, yCoordinate));
        map[xCoordinate][yCoordinate] = O_DOT;

    }

    private static void humanTurn() {
            int xCoordinate = -1;
            int yCoordinate = -1;
            do {
                System.out.println("Введите координаты в формате x y");
                if (sc.hasNextInt()) {
                    xCoordinate = sc.nextInt() - 1;
                }
                if (sc.hasNextInt()) {
                    yCoordinate = sc.nextInt() - 1;
                }
                sc.nextLine();
            } while (!isValidCell(xCoordinate, yCoordinate));
            map[xCoordinate][yCoordinate] = X_DOT;
        }



    private static boolean isValidCell (int x, int y) {
        if (x < 0 || y < 0 || x > map.length - 1 || y > map.length - 1){
            return false;
        }
        return map[x][y] == EMPTY;

    }
    private static void printMap() {
        for (char[] chars : map) {
            for (char aChar : chars){
                System.out.print(aChar + " ");
            }
            System.out.println();
        }
    }
    private static void initGame() {
        sc = new Scanner(System.in);
        map = new char [SIZE][SIZE];
        for (char[] chars : map){
            Arrays.fill(chars, EMPTY);

        }
    }
}
