package ru.geekbrains.lesson4;

import java.util.Random;
import java.util.Scanner;

public class MainAppShum {

    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    static char[][] map;
    static final int SIZE = 3;
    static final int DOT_TO_WIN = 3;

    static final char DOT_PLAYER = 'X';
    static final char DOT_AI = 'O';
    static final char DOT_EMPTY = '•';

    public static void main(String[] args) {

        prepareMap();
        printMap();
        while (true) {
            playerTurn();
            printMap();
            if (checkWin(DOT_PLAYER)) {
                System.out.println("Победил Игрок! ");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin(DOT_AI)) {
                System.out.println("Победил ИИ! ");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена! ");
    }


    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkWin(char symbol) {
        boolean coll;
        boolean result = false;
        boolean row;
        int rightDiagonal = 0;
        int leftDiagonal = 0;

        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == symbol) {
                leftDiagonal++;
            }
            if (map[SIZE - i - 1][i] == symbol) {
                rightDiagonal++;
            }
            if (leftDiagonal >= DOT_TO_WIN || rightDiagonal >= DOT_TO_WIN) {
                return true;
            }
        }

        for (int i = 0; i < SIZE; i++) {
            coll = true;
            row = true;
            for (int j = 0; j < SIZE; j++) {
                coll = coll && (map[i][j] == symbol);
                row = row && (map[j][i] == symbol);
            }
            if (coll || row) return result = true;
        }
        return result;
    }


    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер сделал ход в точку " + (x + 1) + " " + (y + 1));
        map[x][y] = DOT_AI;
    }

    public static void playerTurn() {
        int x, y;
        do {
            System.out.println("Выберите клетку для хода в формате X Y ");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = DOT_PLAYER;

    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x > SIZE || y < 0 || y > SIZE) return false;
        if (map[x][y] == DOT_EMPTY) return true;
        return false;
    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int x = 0; x < SIZE; x++) {
            System.out.print((x + 1) + " ");
            for (int y = 0; y < SIZE; y++) {
                System.out.print(map[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void prepareMap() {
        map = new char[SIZE][SIZE];

        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                map[x][y] = DOT_EMPTY;
            }
        }

    }
}
