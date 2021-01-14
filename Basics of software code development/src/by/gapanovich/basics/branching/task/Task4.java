package by.gapanovich.basics.branching.task;

/*
    Task:
    Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
    Определить, пройдет ли кирпич через отверстие.
 */

import java.io.InputStream;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("A = ");
        double A = enterValue(System.in);
        System.out.print("B = ");
        double B = enterValue(System.in);

        System.out.print("x = ");
        double x = enterValue(System.in);
        System.out.print("y = ");
        double y = enterValue(System.in);
        System.out.print("z = ");
        double z = enterValue(System.in);

        System.out.println("Will the brick go through the hole: " + isFitBrick(A, B, x, y, z));
    }

    public static boolean isFitBrick(double A, double B, double x, double y, double z){
        return (x <= A && y <= B) || (x <= B && y <= A) || (x <= A && z <= B) || (z <= A && x <= B) || (y <= A && z <= B) &&
                (z <= A && y <= B);
    }

    public static double enterValue(InputStream input){
        Scanner scan = new Scanner(input);
        return scan.nextDouble();
    }
}
