package java1.lessonsforqa.lesson2;

import java.sql.SQLOutput;

public class HomeWorkApp2 {

    public static void main (String[] args) {

        System.out.println(checkSum(10, -12));
        checkSumSign(0);
        System.out.println(checkNumber(-1));
        line("Hello", 8);
        System.out.println(checkYear(1204));

    }
    static boolean checkSum (int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }
    static void checkSumSign (int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    static boolean checkNumber (int a) {
        return a < 0;
    }
    public static void line (String str, int a) {
        for (int i = 1; i <= a; i++) {
            System.out.println(str);
        }
    }
    static boolean checkYear (int a) {
        return a % 4 == 0 && a % 100 != 0 || a % 400 == 0;
    }

}