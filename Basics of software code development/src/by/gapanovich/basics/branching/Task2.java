package by.gapanovich.basics.branching;

/*
    Task:
    Найти max{min(a, b), min(c, d)}.
 */

import java.io.InputStream;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("a=");
        int a = enterNumber(System.in);
        System.out.print("b=");
        int b = enterNumber(System.in);
        System.out.print("c=");
        int c = enterNumber(System.in);
        System.out.print("d=");
        int d = enterNumber(System.in);

        System.out.println("max{min(a, b), min(c, d)} = " + findMaxFromTwoMin(a, b, c ,d));
    }

    private static int enterNumber(InputStream input){
        Scanner scan = new Scanner(input);
        return scan.nextInt();
    }

    private static int findMaxFromTwoMin(int a, int b, int c, int d){
        return Math.max(Math.min(a, b), Math.min(c, d));
    }
}
