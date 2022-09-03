package lesson3;

import java.sql.SQLOutput;

public class HomeWorkApp3 {

    public static void main(String[] args) {
        replaceArray();
        System.out.println("");

        fillArray();
        System.out.println("");

        changeArray();
        System.out.println("");

        fillDiagonal();
        System.out.println("");

        generateArray(10,5);
        System.out.println("");

    }

    public static void replaceArray() {
        int[] numbs = {0, 0, 1, 0, 1, 1, 1, 0, 0, 1};
        for (int i = 0; i < numbs.length; i++) {
            if (numbs[i] == 0) {
                numbs[i] = 1;
            } else {
                numbs[i] = 0;
            }
            System.out.print(numbs[i] + " ");
        }
        System.out.println();
    }

    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void fillDiagonal() {
        int [] [] table = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    table [i][j] = 1;
                }
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
            }
        }
    public static void generateArray(int len, int initialValue) {

        int[] newArray = new int[len];
        for (int i = 0; i < len; i++) {
            newArray[i] = initialValue;
            System.out.println("[" + i + "] = " + newArray[i] + " ");
        }
    }

}




