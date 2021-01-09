package by.gapanovich.basics.branching.task;

/*
    Task:
    Вычислить значение функции:
    F(x) = x^2 - 3x + 9 , if x <= 3 AND 1/(x^3 + 6) , if x > 3
 */

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Enter value");
        System.out.print("x = ");
        double x = enterValue(System.in);
        System.out.print("The result of function = " + findValueFunc(x));
    }

    private static double findValueFunc(double x){
        if (x <= 3) {
            return Math.pow(x, 2) - 3 * x + 9;
        }
        return Math.pow(Math.pow(x, 3) + 6, -1);
    }

    private static double enterValue(InputStream input){
        Scanner scan = new Scanner(input);
        return scan.nextDouble();
    }
}
